package MergeSortMultiThread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static void main(String args[]) throws ExecutionException, InterruptedException {

        List<Integer>ListToSort = List.of(3,2,1,4,6,8,7,5);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(ListToSort,executorService);
        Future<List<Integer>> FutureSortedList = executorService.submit(mergeSorter);

        List<Integer>SortedList = FutureSortedList.get();
        System.out.println(SortedList);
        executorService.shutdown();

    }
}
