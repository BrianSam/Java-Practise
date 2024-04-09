package DesignPattern.Structural_DP.Decorator;

public class Decaf implements Beverage{
    @Override
    public void getDesc() {
        System.out.println("Decaf has been added");
    }

    @Override
    public int getCost() {
        return 50;
    }
}
