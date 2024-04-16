package AssingmentPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class ArrayCreator implements Callable<List<Integer>> {

    public Integer n;




    ArrayCreator(Integer n){
        this.n=n;
    }
    @Override
    public List<Integer> call() throws Exception {

        List<Integer>ansArr = new ArrayList<>();

        for(int i=1;i<n;i++){
            ansArr.add(i);
        }

        return ansArr;







    }
}
