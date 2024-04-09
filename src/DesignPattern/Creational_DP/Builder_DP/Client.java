package DesignPattern.Creational_DP.Builder_DP;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        Builder builder = Student.getBuilder();//by this we are connecting student and builder
//        //before builder was an independent entity
//        builder.setName("Brian");
//        builder.setAge(25);
//        builder.setBatch("mwf Evening");
//        builder.setPsp(90);
//        builder.setGradYear(2022);
//        builder.setPhoneNo("8109309940");
//
//        Student student = new Student(builder);

        // student class should suggest to use builder class
        //if we want to make object of student class it should go through builder class

        Student student = Student.getBuilder().setName("Brian").setAge(25).setBatch("mwf eve").setGradYear(2020)
                        .setPsp(90).setPhoneNo("8109309940").build();

        System.out.println("DEBUG");
    }
}
