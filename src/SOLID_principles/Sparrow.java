package SOLID_principles;

import java.sql.SQLOutput;

public class Sparrow extends Bird implements fly{
    @Override
    public void makeSound() {
        System.out.println("sparrow is making sound");
    }


    @Override
    public void flying() {
        System.out.println("Sparrow is flying");
    }
}
