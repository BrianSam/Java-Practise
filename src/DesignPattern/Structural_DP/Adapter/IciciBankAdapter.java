package DesignPattern.Structural_DP.Adapter;

public class IciciBankAdapter implements BankApi{

    IciciBankApi iciciBankApi = new IciciBankApi();
    @Override
    public int CheckBalance() {
        return iciciBankApi.GetBalance();
    }

    @Override
    public void MoneyTransfer() {
        iciciBankApi.transferFunds();

    }
}
