package DesignPattern.Structural_DP.Decorator;

public class Client {
    public static void main(String[] args) {

        Beverage b= new Black();
        b=new Whip(b);
        b.getDesc();
        System.out.println(b.getCost());
    }
}
