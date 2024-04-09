package DesignPattern.Creational_DP.Factory.components;

public class Ios extends Platform{
    @Override
    public void RefreshRate() {
        System.out.println("IOS refresh rate");
    }

    @Override
    public void Charge_time() {
        System.out.println("IOS CHARGE TIME");
    }

    @Override
    public UIComponentFactory uiComponentFactory() {
        return new IosComponentFactory();
    }
}
