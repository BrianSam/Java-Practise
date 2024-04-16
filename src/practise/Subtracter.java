package practise;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Subtracter implements Runnable{

    Count count;
    Lock lock;

    public Subtracter(Count count,Lock lock){
        this.count=count;
        this.lock=lock;
    }
    @Override
    public void run() {

        for(int i=1;i<=100000;i++){

            lock.lock();
            count.val-=i;
            lock.unlock();

            System.out.println(count.val);
        }

    }
}
