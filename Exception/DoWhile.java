import java.util.Scanner;
import java.util.InputMismatchException;

public class DoWhile {
    public static int coesient (int a , int b )
    {
        return a/b;
    }
    public static void main (String[] args) {
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
        catch (ArithmeticException a) {
            System.out.println("zero is invalid for makhraj. please try again.");
            input.nextLine();       // clears the input buffer
        }
        catch (InputMismatchException i) {
            System.out.println("the input should be a number. please try again.");
            input.nextLine();
        }
        } while (flag);
        System.out.println("the rest of the code is executed.");

    }

}