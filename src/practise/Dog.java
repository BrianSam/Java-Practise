package practise;

public class Dog extends Animal{
    @Override
    public void walk() {
        System.out.println("dog is walking");
    }

    @Override
    public void run() {
        System.out.println("dog is running");

    }

    public void eat(){
        System.out.println("dog is eating");
    }

    public static void stat(){
        System.out.println("insde static meethod of dog");
    }
}
