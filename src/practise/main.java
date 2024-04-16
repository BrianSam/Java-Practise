package practise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


//
//        threadPractise  tp = null;
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        for(int i=1;i<=100;i++){
//
//            tp=new threadPractise(i);
//            executorService.submit(tp);
//
//
//
//        }
//        executorService.shutdown();



//        List<Integer> arr =List.of(2,3,8,6,5,1,9);
//
//        ExecutorService executorService =  Executors.newCachedThreadPool();
//        Sorter sorter = new Sorter(arr,executorService);
//
//        Future<List<Integer>>futureSortedArr= executorService.submit(sorter);
//
//        List<Integer>sortedArr = futureSortedArr.get();
//
//        System.out.println(sortedArr);
//        executorService.shutdown();

        Lock lock = new ReentrantLock();
        Count count = new Count();
        Adder adder = new Adder(count,lock);
        Subtracter subtracter = new Subtracter(count,lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtracter);
        t1.start();

        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.val) ;

    }
}
