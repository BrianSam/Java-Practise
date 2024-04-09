package DesignPattern.Behavioural_DP.Observer;

public class InventoryService implements OnOrderPlaced{


    @Override
    public void Announce() {
        System.out.println("Inventory updated");
    }
}
