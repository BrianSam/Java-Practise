package DesignPattern.Behavioural_DP.Stratergy;

public class WalkPathCalc implements PathCalc{
    @Override
    public void PathFinder(String source, String destination) {
        System.out.println("best route to travel by walking from "+source+" to "+destination+" takes 45 min");
    }
}
