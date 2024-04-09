package ExceptionHandling;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // what are exceptions

        StringBuffer s1 = new StringBuffer("hello");
        System.out.println(System.identityHashCode(s1));

        StringBuffer s2 = new StringBuffer("hello");

        String s3 = "";
        String s4= "hello";

        s1.append("byeee");



        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

    }
}
