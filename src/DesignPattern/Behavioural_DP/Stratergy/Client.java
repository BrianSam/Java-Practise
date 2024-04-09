package DesignPattern.Behavioural_DP.Stratergy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.FindPath("Bhilai","Raipur","car");
        googleMaps.FindPath("ayyappa Nagar","Nehru nagar","bike");
    }
}
