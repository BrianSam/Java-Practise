package DesignPattern.Behavioural_DP.Stratergy;

public class BikePathCalc implements PathCalc{
    @Override
    public void PathFinder(String source, String destination) {
        System.out.println("best route to travel by bike from "+source+" to "+destination+" takes 20 min");
    }
}
