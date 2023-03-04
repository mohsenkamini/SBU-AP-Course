import java.util.Scanner;
import java.util.Date;

public class Book {
    private int ISBN;
    Book (int i) {
        ISBN=i;
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
        Book b3=b1;
        b3.display();

        Date D = new Date();
        System.out.println(D.toString());
        System.out.println(b1);
    }    
}