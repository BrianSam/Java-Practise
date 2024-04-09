package DesignPattern.Structural_DP.Adapter;

public class IciciBankApi {

    int GetBalance(){
        return 100;
    }

    void transferFunds(){
        System.out.println("icici bank transfer funds");
    }
}
