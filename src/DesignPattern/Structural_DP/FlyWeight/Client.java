package DesignPattern.Structural_DP.FlyWeight;

public class Client {
    public static void main(String[] args) {
        Bullet ak47 = new Bullet().setName("Ak47 bullet").setWeight(100);
        Bullet magnum = new Bullet().setName("Magnum Bullet").setWeight(200);

        FlyingBullet up = new FlyingBullet(ak47).setCoordinate("Air");
        FlyingBullet ground = new FlyingBullet(magnum).setCoordinate("Ground");
        System.out.println(up.b.getName()+" is in "+up.getCoordinate()+" having weight "+up.b.getWeight());
        System.out.println(ground.b.getName()+" is in "+ground.getCoordinate()+" having weight "+ground.b.getWeight());



    }
}
