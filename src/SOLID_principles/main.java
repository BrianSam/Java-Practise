package SOLID_principles;

public class main {
    public static void main(String[] args) {
        Bird b= new Sparrow();
        b.setName("blue sparrow");
        b.setAge(10);
        b.setColor("blue");
        b.setType("xyz");
        b.setWeight(20);

        ((Sparrow) b).flying(); // Correct way to call the flying() method

        b= new Penguin();
        b.setName("B/W penguin");
        b.setAge(15);
        b.setColor("B/W");
        b.setType("xyz");
        b.setWeight(20);

        b.makeSound();



    }
}
