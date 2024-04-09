package DesignPattern.Creational_DP.Singleton_DP;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Database {

    private static  Database dbc=null;
    public static final Lock lock = new ReentrantLock();
    String user_name ="Connection Successful" ;

    private Database(){}
    public static Database getInstance(){
        if(dbc==null){
            lock.lock();
            if(dbc == null){
                dbc = new Database();
            }
            lock.unlock();


        }
        return dbc;
    }


}
