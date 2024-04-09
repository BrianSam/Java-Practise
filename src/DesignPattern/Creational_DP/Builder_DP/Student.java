package DesignPattern.Creational_DP.Builder_DP;

public class Student {
    String name;
    int age;
    double psp;
    String batch;
    int gradYear;
    String phoneNo;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){

        this.name=builder.getName();
        this.age=builder.getAge();
        this.psp=builder.getPsp();
        this.batch=builder.getBatch();
        this.gradYear=builder.getGradYear();
        this.phoneNo=builder.getPhoneNo();
    }

    public static class Builder {
        String name;
        int age;
        double psp;
        String batch;
        int gradYear;
        String phoneNo;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Student build(){
            if(this.getAge()<20){
                throw new RuntimeException("Age should not be less than 20");
            }
            if(this.getGradYear()>2023){
                throw new RuntimeException("Grad year should not be more than 2023");
            }


            return new Student(this);

        }


    }
}
