package DesignPattern.Behavioural_DP.Observer;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Flipkart {

    private static Flipkart flipkart =null;

    private List <OnOrderPlaced>Subscribers= new ArrayList<>();

    Flipkart(){}

    public static Flipkart getInstance(){
        if(flipkart==null){
            flipkart=new  Flipkart();
        }
        return flipkart;
    }

    void RegisterSub(OnOrderPlaced onOrderPlaced){
        this.Subscribers.add(onOrderPlaced);
    }

    void UnRegisterSub(OnOrderPlaced onOrderPlaced){
        this.Subscribers.remove(onOrderPlaced);
    }

    public void OnOrderPlaced(){
        for(OnOrderPlaced Subscriber:Subscribers){
            Subscriber.Announce();

        }
    }

}
