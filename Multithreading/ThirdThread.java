public class ThirdThread extends Thread{
    public void run() {
        if (Thread.currentThread().isDaemon())
            System.out.println("This is a daemon thread");
        else 
            System.out.println("This is a user thread ");

    }
    public static void main (String[] args) {
        Thread t1 = new ThirdThread();
        Thread t2 = new ThirdThread();
        Thread t3 = new ThirdThread();
        t2.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
