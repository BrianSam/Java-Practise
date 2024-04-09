package practise;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Node implements Iterable{

    private int data;
    private Node next;

    public Node(int data){
        this.data =data;
        this.next=null;
    }

    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    @Override
    public Iterator<Node> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
