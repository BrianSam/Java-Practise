package practise;

import java.util.Comparator;

public class Car implements Comparable<Car> {

    int Price;
    int Speed;


    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.Price,o.Price);
    }
}
