package DesignPattern.Behavioural_DP.Stratergy;

public class FindModeFactory {

    public static PathCalc FindMode(String mode){
        if(mode=="car"){
            return new CarPathCalc();
        } else if (mode=="bike") {
            return new BikePathCalc();
        }
        else {
            return new WalkPathCalc();
        }
    }
}
