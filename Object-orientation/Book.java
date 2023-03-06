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
    public static void arrayShiftLeft (int[] array)
    {
        for (int i= 0 ; i < array.length-1 ; i++)
            array[i]=array[i+1];
        array[array.length-1]=0;
    }

    public static void arrayShiftRight (int[] array)
    {
        for (int i= array.length-1 ; i > 0 ; i--)
            array[i]=array[i-1];
        array[0]=0;
    }
    public static void main () {
        Book b1 = new Book(1769);
        Scanner input = new Scanner (System.in);
        
        //Book b5 = new Book(); java only adds a no-arg constructor when there are no constructors defined by you.
        Book b2 = new Book(1769);
        Book b3=b1;
        //b3.display();

        Date D = new Date();
        //System.out.println(D.toString());
        //System.out.println(b1);
        //System.out.println(b3.counter);

        int x = input.nextInt();
        int min=101,max=0,sum=0;
        int[] array1 = new int [x];
        for (int i=0 ; i < array1.length ; i++) 
        {
            array1[i] = (int) (Math.random()*101);
            if (array1[i] > max)
                max=array1[i];
            if (array1[i] < min)
                min=array1[i];
            sum+=array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println("\nmax: " + max + " min: "+ min + " avg: "+ (double)(sum/array1.length));
        for (int i=0 ; i < array1.length ; i++) 
        {   
            int n1=(int)(Math.random()*(array1.length));
            int n2=(int)(Math.random()*(array1.length));
            int temp=array1[n1];
            array1[n1]=array1[n2];
            array1[n2]=temp;
        }
        for (int i=0 ; i < array1.length ; i++) 
            System.out.print(array1[i]+ " " );
        System.out.println("\nShift Right: ");
        arrayShiftRight(array1);

        for (int i=0 ; i < array1.length ; i++) 
            System.out.print(array1[i]+ " ");

        System.out.println("\nShift Left: ");

        arrayShiftLeft(array1);

        for (int value: array1) 
            System.out.print(value+ " ");
            
    }    
}