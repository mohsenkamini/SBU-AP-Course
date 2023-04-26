interface Readable extends Printable,Showable {
    void read() ;
    public static void main (String[] args) {
        Test.main();
    }
}

abstract class A implements Readable {
    public void display() {
        System.out.println("The file is displayed.");
    }
}


class B extends A {
    public void print() {
        System.out.println("The file is printed.");
    }
    public void read() {
        System.out.println("The file is read.");
    }
    public void show() {
        System.out.println("The file is shown.");
    }
}

class Test {
    public static void main () {
        Printable b1 = new B();
        b1.print();
        b1.display();
        //b1.show();
        Showable b2 = new B();
        Readable b3 = new B();

        //b2.print();
        //b2.display();
        b2.show();

        b3.print();
        b3.display();
        b3.show();
    }
}