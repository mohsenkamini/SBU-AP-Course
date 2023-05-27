public class Delkhah extends Thread {
    public void run() {
        System.out.println("task 1");
    }
    public static void main (String [] args) {
        Delkhah t1 = new Delkhah();
        Delkhah t2 = new Delkhah();
        Delkhah2 t3 = new Delkhah2();

        t1.start();
        t2.start();
        t3.start();
    }
    
}
class Delkhah2 extends Thread {
    public void run() {
        System.out.println("task 2");
    }
    
}