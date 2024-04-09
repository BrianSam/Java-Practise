package DesignPattern.Creational_DP.Factory.components.button;

public class AndroidButton implements Button{
    @Override
    public int getSize() {
        return 100;
    }

    @Override
    public String newButton() {
        return "Android Button";
    }
}
