package DesignPattern.Structural_DP.FlyWeight;

public class FlyingBullet {

    public Bullet b;
    private String coordinate;
    FlyingBullet(Bullet B){
        this.b=B;
    }


    public String getCoordinate() {
        return coordinate;
    }

    public FlyingBullet setCoordinate(String coordinate) {
        this.coordinate = coordinate;
        return this;
    }
}
