package DesignPattern.Structural_DP.Adapter;

public class YesBankApi {

    int checkBalance(){
        return 200;
    }

    void transferMoney(){
        System.out.println("Yes bank money transfer");
    }
}
