package DesignPattern.Creational_DP.Factory.components;

public class UiFactory {

    public static UIComponentFactory CreateUIfactory(String plt){
        if(plt=="Android"||plt =="android"){
            return new AndroidComponentFactory();

        } else if (plt=="IOS" || plt=="ios") {
            return new IosComponentFactory();

        }
        else return null;
    }

}
