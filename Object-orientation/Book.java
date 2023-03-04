import java.util.Scanner;
import java.util.Date;

public class Book {
    static int counter; // counter will be shared among all objects. This won't be in heap
    private int ISBN;
    Book (int i) {
        ISBN=i;
        counter++;
    }
    void display() {
        System.out.println("The ISBN is: " + ISBN);
    }
    public static void main (String[] args) {
        testBook.main();
    }
}
class testBook {
    public static void main () {
        Book b1 = new Book(1769);
        Book b2 = new Book(1769);
        Book b3=b1;
        b3.display();

        Date D = new Date();
        System.out.println(D.toString());
        System.out.println(b1);
        System.out.println(b3.counter);
    }    
}