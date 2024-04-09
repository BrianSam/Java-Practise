package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class main {
    public static void main(String[] args) {

        BinaryOperator<String> merge_str =(str1, str2)-> str1+str2;
        System.out.println(merge_str.apply("Brian","Sam"));



    }
}
