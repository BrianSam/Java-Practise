package DesignPattern.Behavioural_DP.Observer;

public class InvoiceGenerator implements OnOrderPlaced{
    @Override
    public void Announce() {
        System.out.println("invoice generated");
    }
}
