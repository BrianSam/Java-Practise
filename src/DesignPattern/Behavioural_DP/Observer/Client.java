package DesignPattern.Behavioural_DP.Observer;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart =Flipkart.getInstance();
        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();
        InvoiceGenerator invoiceGenerator =new InvoiceGenerator();

        flipkart.RegisterSub(emailService);
        flipkart.RegisterSub(inventoryService);
        flipkart.RegisterSub(invoiceGenerator);

        flipkart.OnOrderPlaced();
    }
}
