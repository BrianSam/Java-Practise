package practise;

public abstract class Animal {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void eat(){
        System.out.println("Animal is eating");
    }

    abstract public void walk();
    abstract public void run();

}
