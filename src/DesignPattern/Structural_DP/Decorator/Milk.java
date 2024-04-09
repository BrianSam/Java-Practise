package DesignPattern.Structural_DP.Decorator;

public class Milk implements Addon {

    Beverage b;

    Milk(Beverage b){
        this.b=b;
    }
    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Addon: Milk has been added");

    }

    @Override
    public int getCost() {
        return 25+ b.getCost();
    }
}
