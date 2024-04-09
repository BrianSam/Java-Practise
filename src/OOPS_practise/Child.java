package OOPS_practise;

public class Child extends Parent{

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setEthnicity(String ethnicity) {
        super.setEthnicity(ethnicity);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getEthnicity() {
        return super.getEthnicity();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void Behaviour() {
        System.out.println("inside child class");

    }

    public void Behaviour2() {
        System.out.println("inside child class behaviour 2");

    }

}
