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

    }

    class NodeIterator implements Iterator<Node>{
        Node head;
        public NodeIterator(Node head){
            this.head  = head;
        }

        @Override
        public boolean hasNext() {
            if(head==null || head.next==null){
                return false;
            }
            else{
                return true;
            }
        }

        @Override
        public Node next() {
            Node curr = head;
            head=head.next;
            return curr;
        }
    }

}
