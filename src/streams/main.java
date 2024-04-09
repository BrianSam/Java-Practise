package streams;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,7,5,4,2,8,10,3);
        //q.ex

        List<Integer>num1 = numbers.stream().filter((num)->num%2==0).toList();
        System.out.println(num1);
    }
}
