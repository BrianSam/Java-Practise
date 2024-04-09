package DesignPattern.Structural_DP.Decorator;

public class Whip implements Addon{

    Beverage b;
    Whip(Beverage b){
        this.b=b;
    }
    @Override
    public void getDesc() {

        b.getDesc();
        System.out.println("Addon :whip has been added");

    }

    @Override
    public int getCost() {
        return 50+ b.getCost();
    }
}
