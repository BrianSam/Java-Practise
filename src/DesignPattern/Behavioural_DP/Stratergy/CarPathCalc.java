package DesignPattern.Behavioural_DP.Stratergy;

public class CarPathCalc implements PathCalc{
    @Override
    public void PathFinder(String source, String destination) {
        System.out.println("best route to travel by Car from "+source+" to "+destination+" takes 30 min");
    }
}
