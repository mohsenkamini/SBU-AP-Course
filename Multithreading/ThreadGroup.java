public class ThreadGroup implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main (String[] args) {
        ThreadGroup tg1 = new ThreadGroup("Parent TG");
        Thread t1 = new Thread(tg1,Runnable,"one");
        Thread t2 = new Thread(tg1,Runnable,"Two");
        Thread t3= new Thread(tg1,Runnable,"Three");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread Group Parent" + tg1.getName());
        tg1.list();
    }
}l
