import java.lang.*;  

public class TG implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main (String[] args) {

        TG runnable = new TG(); 
        ThreadGroup tg1 = new ThreadGroup("Parent TG");
        Thread t1 = new Thread(tg1,runnable,"one");
        Thread t2 = new Thread(tg1,runnable,"Two");
        Thread t3= new Thread(tg1,runnable,"Three");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread Group Parent" + tg1.getName());
        tg1.list();
    }
}