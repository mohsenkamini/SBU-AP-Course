public class SecondThread implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i=0; i < 5 ; i++) {
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException a) {
                System.out.println(a);
            }
            System.out.println(i);
        }
    }
    public static void main (String[] args) {
        SecondThread tm = new SecondThread();
        SecondThread tm2 = new SecondThread();
        SecondThread tm3 = new SecondThread();
        Thread t1 = new Thread(tm);
        Thread t2 = new Thread(tm2);
        Thread t3 = new Thread(tm3);
        //t1.run();   // loses the power of multithreading if we don't use start and use run
        //t2.start();
        t1.setName("mohsen");
        t1.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t1.start();
        //try {                   
        //    t2.join();      // sets priority and stops other threads to be running before these get completed
        //    t1.join();
        //} catch (Exception a) {System.out.print(a);}
        t3.start();
        System.out.println(t1.getName()+ " "+ t1.getId());
        System.out.println(t2.getName()+ " "+ t2.getId());
        System.out.println(t3.getName()+ " "+ t3.getId());

    }
}
