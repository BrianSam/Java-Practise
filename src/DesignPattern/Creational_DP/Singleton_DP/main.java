package DesignPattern.Creational_DP.Singleton_DP;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Database dbc = Database.getInstance();
        System.out.println(dbc.user_name);







    }
}
