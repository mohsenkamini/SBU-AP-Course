import java.util.Scanner;


public class Jalase5 {

    // METHODS
    // modifier           outputType (formal parameters)
    public static int sign (int n) {
        if (n>0)
            return 1;
        else if (n == 0)
            return 0;
        else
            return -1;
    }

    // Methods' signature
    // max (int num1,int num2)


    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        int num1=0,num2=2;
        System.out.println(sign (6));
        /*
        int i=0;
        float result=10000;

        for (i=0;
         result < 20000.0 ; i++); {
            result += 0.07 * result;
        }
        System.out.println (i);
        */
    }
}