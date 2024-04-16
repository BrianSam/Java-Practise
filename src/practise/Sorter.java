package practise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer>arr;

    private ExecutorService executorService;

    Sorter(List<Integer> arr ,ExecutorService executorService){
        this.arr=arr;
        this.executorService=executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(arr.size()==1){
            return arr;
        }

        int n= arr.size();

        int mid = n/2;

        List<Integer> leftArr;
        List<Integer>rightArr;

        leftArr=arr.subList(0,mid);
        rightArr=arr.subList(mid,n);


        Sorter leftsorter = new Sorter(leftArr,executorService);

        Sorter rightsorter=new Sorter(rightArr,executorService);
        Future<List<Integer>>future_sorted_left = executorService.submit(leftsorter);
        Future<List<Integer>>future_sorted_right= executorService.submit(rightsorter);


        List<Integer>sorted_right = future_sorted_right.get();
        List<Integer>sorted_left = future_sorted_left.get();

        List<Integer>Sorted_arr = new ArrayList<>();

        int i=0,j=0;

        while(i<sorted_right.size() && j<sorted_left.size()){
            if(sorted_right.get(i)<sorted_left.get(i)){
                Sorted_arr.add(sorted_right.get(i));
                i++;
            }else{
                Sorted_arr.add(sorted_left.get(j));
                j++;
            }
        }

        while(i<sorted_right.size()){
            Sorted_arr.add(sorted_right.get(i));
            i++;
        }

        while (j<sorted_left.size()){
            Sorted_arr.add(sorted_left.get(j));
            j++;
        }

        return Sorted_arr;




    }

}
