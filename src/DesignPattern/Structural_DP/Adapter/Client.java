package DesignPattern.Structural_DP.Adapter;

public class Client {
    public static void main(String[] args) {
        BankApi bankApi = new YesBankAdapter();
        PhonePe phonePe = new PhonePe(bankApi);

        System.out.println(phonePe.bankApi.CheckBalance());
        phonePe.bankApi.MoneyTransfer();

        bankApi = new IciciBankAdapter();
        phonePe = new PhonePe(bankApi);
        System.out.println(phonePe.bankApi.CheckBalance());
        phonePe.bankApi.MoneyTransfer();
    }

}
