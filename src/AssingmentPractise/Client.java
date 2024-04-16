package AssingmentPractise;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int n =scanner.nextInt();

        ExecutorService executorService = Executors.newCachedThreadPool();

        ArrayCreator arrayCreator =new ArrayCreator(n);

        Future<List<Integer>> futureArr=executorService.submit(arrayCreator);

        List<Integer>ansList = futureArr.get();
        System.out.println(ansList);
        executorService.shutdown();



    }
}
