public class Intro {
    public static void main (String[] args) {
        FirstThread t1 = new FirstThread();
        FirstThread t2 = new FirstThread();
        t1.start();         // make it runnable and if JVM picks it, it will run it
        t2.start();
    }
}

class FirstThread extends Thread {
    public void run () {
        // whatever we want to do in this thread
        System.out.println("the thread is running...");
    }
}