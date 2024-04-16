package practise;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class threadPractise implements Runnable{
    int num;

  public threadPractise(int num){
      this.num = num;
  }





    @Override

    public void run() {

        System.out.println("hello word : thread name : "+Thread.currentThread().getName()+" num :- "+num);

    }


}
