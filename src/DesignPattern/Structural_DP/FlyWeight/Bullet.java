package DesignPattern.Structural_DP.FlyWeight;

public class Bullet {

    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public Bullet setName(String name) {
        this.name = name;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Bullet setWeight(int weight) {
        this.weight = weight;
        return this;
    }
}
