package DesignPattern.Creational_DP.Prototype_and_registry;

public class Client {
    public static void main(String[] args) {
        Student mwf_batch=new Student();
        mwf_batch.setBatch("mwf_batch");
        mwf_batch.setAvgBatchPsp(90);
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.Register("mwf_batch",mwf_batch);


        Student brian = studentRegistry.get("mwf_batch").clone();
        brian.setName("Brian");

        System.out.println("DEBUG");


    }
}
