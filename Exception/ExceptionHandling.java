import java.util.Scanner;

public class ExceptionHandling {
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        try {
            System.out.println("enter a: ");
            int a=input.nextInt();
            System.out.println("enter index: ");
            int index=input.nextInt();
            int x=10/a;
            int[] array  = new int[8];
            array[index]=8;
        }
        catch(ArrayIndexOutOfBoundsException a) {  // a is the object name of the exception thrown
            System.out.println("invalid index value");
        }
        catch(ArithmeticException a) {  // a is the object name of the exception thrown
            System.out.println("Can't devide by zero");
        }
        catch(java.lang.Exception e) {      // normally we dont need to specify java.lang but my file name contains Exception that causes compile error.
            System.out.println(e);
        }
        // String s=null;
        // System.out.println(s.length());
        
        // int x = Integer.parseInt("123mohsen");

        // int[] array = new int[5];
        // array[5]=6;
        // array[5]=10/0;

        System.out.println("the rest of the code is executed");
    }
}