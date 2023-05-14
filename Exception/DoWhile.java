import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class DoWhile {
    public static int coesient (int a , int b )
    {
        return a/b;
    }
    public static void main (String[] args) {
        //Child.main();
        //Jadid.main();
        Voting.main();
        Scanner input = new Scanner(System.in);
        boolean flag=true;
        do
        {
        try {
            System.out.println("enter soorat: ");
            int x=input.nextInt();
            System.out.println("enter makhraj: ");
            int y=input.nextInt();

            System.out.println(coesient(x,y));
            flag=false;
        }
        //catch (ArithmeticException a) {
        //    System.out.println("zero is invalid for makhraj. please try again.");
        //    input.nextLine();       // clears the input buffer
        //}
        catch (InputMismatchException i) {
            System.out.println("the input should be a number. please try again.");
            input.nextLine();
        }
        finally {                           // runs either when a exception is catched or not
            System.out.println("running finally");
        }
        } while (flag);
        System.out.println("the rest of the code is executed.");

    }

}
    /// Throw a custom exception
class Voting {
    public void validate (int age) throws Mohsen{
        if (age < 16)
            throw new Mohsen ("invalid age");  
        else
            System.out.println("welcome to voting");
    }
    public static void main () {
        Voting a = new Voting();
        Voting b = new Voting();
        try {
        a.validate(17);
        a.validate(15);
        }
        catch (Mohsen ab) {            //checked exception ha injuri kar nmikonan mese IOException
                                            // mage inke throws IOException ro bezarim to signaturesh
            System.out.println("ehem.");
        }
        System.out.println("the rest of the code is executed.");

        
    }
}

class Jadid {
    void m() throws IOException{
        throw new IOException ("some");  
        //int x = 10/0;

    }
    void n() throws IOException {
        m();
    }
    void p () throws IOException{
        n();
    }
    public static void main () {
        Jadid some = new Jadid();
        try {
        some.p();
        }
        catch (java.lang.Exception abc) {            
            System.out.println("abc.");
        }

    }
}

class Parent {
    void display() throws IOException{
        System.out.println("parent displaying...");
    }

}
class Child extends Parent {
    void display() throws IOException{
        System.out.println("child displaying...");        
    }
    public static void main () {
        Child mohsen = new Child();
        try {
        mohsen.display();
        }
        catch (IOException sad){
            System.out.println("sdklsmdk");        
        }
    }
}

class Mohsen extends java.lang.Exception {
    Mohsen(String s) {
        super(s);
    }
}