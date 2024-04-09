package DesignPattern.Creational_DP.Factory.components;

public class Android extends Platform{
    @Override
    public void RefreshRate() {
        System.out.println("Android Refresh rate");;
    }

    @Override
    public void Charge_time() {
        System.out.println("Android Charge Time");
    }

    @Override
    public UIComponentFactory uiComponentFactory() {
        return new AndroidComponentFactory();
    }

}
