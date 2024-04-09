package DesignPattern.Behavioural_DP.Observer;

public class EmailService implements OnOrderPlaced{
    @Override
    public void Announce() {
        System.out.println("Email sent to client");
    }
}
