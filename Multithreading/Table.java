public class Table {
    public static void main (String[] args) {
        Table t1 = new Table();
        MyThread1 t2 = new MyThread1(t1);
        MyThread2 t3 = new MyThread2(t1);

        t2.start();
        t3.start();
    }
    //synchronized void printTable (int n) {          // locks the objects it uses so no other thread accesses that object
    void printTable (int n) {          
        synchronized (this) {                   // locks the objects it uses so no other thread accesses that object
            for (int i=1 ; i  <= 5 ; i++) {
                System.out.println(n*i);
                try {
                    Thread.sleep(400);
                } catch (Exception a) {System.out.println(a);}
            }
        }
    }
}
class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t=t;
    }
    public void run () {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t=t;
    }
    public void run () {
        t.printTable(100);
    }
}