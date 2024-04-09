package DesignPattern.Creational_DP.Factory.components.button;

public class IosButton implements Button{
    @Override
    public int getSize() {
        return 101;
    }

    @Override
    public String newButton() {
        return "IOS button";
    }
}
