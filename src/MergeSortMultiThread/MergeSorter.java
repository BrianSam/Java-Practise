package MergeSortMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable <List<Integer>>{
    private List<Integer> listToSort;
    private ExecutorService executorService;
    MergeSorter(List<Integer> listToSort,ExecutorService executorService){
        this.listToSort=listToSort;
        this.executorService=executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        int n= listToSort.size();
        if(n<=1){   //base case
            return listToSort;
        }

        List<Integer>rightPart = new ArrayList<>();  //left part
        List<Integer>leftPart = new ArrayList<>();   //right part


        for(int i=0;i<n/2;i++){                    //adding elements to right part
            leftPart.add(listToSort.get(i));
        }
        for(int i=n/2;i<n;i++){                    //adding elements to left part
            rightPart.add(listToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftPart,executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightPart,executorService);

        Future<List<Integer>> futureLeftSorted = executorService.submit(leftMergeSorter); //different thread
        Future<List<Integer>> futureRightSorted = executorService.submit(rightMergeSorter);

        List<Integer>leftSorted = futureLeftSorted.get(); //blocking call
        List<Integer>rightSorted = futureRightSorted.get();

        int i=0;
        int j=0;

        List<Integer>sortedArray = new ArrayList<>();

        while(i < leftSorted.size() && j < rightSorted.size()){
            if(leftSorted.get(i)<rightSorted.get(j)){
                sortedArray.add(leftSorted.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSorted.get(j));
                j++;
            }
        }

        while(j<rightSorted.size()){
            sortedArray.add(rightSorted.get(j));
            j++;
        }

        while(i<leftSorted.size()){
            sortedArray.add(leftSorted.get(i));
            i++;
        }



        return sortedArray;
    }
}
