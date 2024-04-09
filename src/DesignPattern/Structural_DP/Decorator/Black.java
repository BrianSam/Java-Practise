package DesignPattern.Structural_DP.Decorator;

public class Black implements Beverage{
    @Override
    public void getDesc() {
        System.out.println("Black coffee has been added");
    }

    @Override
    public int getCost() {
        return 100;
    }
}
