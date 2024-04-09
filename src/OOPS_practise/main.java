package OOPS_practise;

public class main {
    public static void main(String[] args) {
        Parent child = new Child();
        child.setColor("brown");
        child.setName("Brian");
        child.setEthnicity("indian");


        System.out.println(child.getName());
        System.out.println(child.getColor());
        System.out.println(child.getEthnicity());

        child.Behaviour();
        ((Child) child).Behaviour2();//this is an eg of downcasting which basically is type casting

        //In summary, ((Child) child).Behaviour2(); allows us to call the Behaviour2() method defined in
        // the Child class on an object that's originally declared as a Parent, by first downcasting it to Child.
        // This enables us to access and invoke methods specific to the child class.

        child =new Parent();

        child.setColor("brown");
        child.setName("Varghese");
        child.setEthnicity("indian");



        System.out.println(child.getName());
        System.out.println(child.getColor());
        System.out.println(child.getEthnicity());
        child.Behaviour();



    }
}
