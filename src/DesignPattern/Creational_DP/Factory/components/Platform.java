package DesignPattern.Creational_DP.Factory.components;

public class Platform {

    private String plt;
    Platform(String plat){
        this.plt=plat;

    }
    Platform(){}
    public void RefreshRate(){
        System.out.println("input ur refresh rate");
    }
    public void Charge_time(){
        System.out.println("enter ur charge time");
    }

    public UIComponentFactory uiComponentFactory(){
        return UiFactory.CreateUIfactory(this.plt);
    }
    }


