package DesignPattern.Behavioural_DP.Stratergy;

public class GoogleMaps {

    void FindPath(String source,String Destination,String mode){

        PathCalc path = FindModeFactory.FindMode(mode);

        path.PathFinder(source,Destination);

    }
}
