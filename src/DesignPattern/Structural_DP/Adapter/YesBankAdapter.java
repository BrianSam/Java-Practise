package DesignPattern.Structural_DP.Adapter;

public class YesBankAdapter implements BankApi{
    YesBankApi yesBankApi = new YesBankApi();

    @Override
    public int CheckBalance() {
        return yesBankApi.checkBalance();
    }

    @Override
    public void MoneyTransfer() {
        yesBankApi.transferMoney();

    }
}
