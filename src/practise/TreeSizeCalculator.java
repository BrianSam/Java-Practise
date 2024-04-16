package practise;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    private Node root;
    private ExecutorService executorService;

    public TreeSizeCalculator(Node root,ExecutorService executorService){
        this.root=root;
        this.executorService=executorService;
    }


    @Override
    public Integer call() throws Exception {
        if(root==null){
            return 0;
        }
        else{
            TreeSizeCalculator futureLeft = new TreeSizeCalculator(root.left,executorService);

            Future<Integer>futureLeftInt =executorService.submit(futureLeft);
            TreeSizeCalculator futureRight = new TreeSizeCalculator(root.right,executorService);
            Future<Integer>futureRightInt = executorService.submit(futureRight);

            return  futureLeftInt.get()+futureRightInt.get()+1;


        }


    }
}
