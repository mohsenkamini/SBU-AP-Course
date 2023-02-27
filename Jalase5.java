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

    // Methods' overloading:
    public static void max (int n1,int n2 ) {
        int result=0;
        if (n1 > n2)
            result=n1;
        else    
            result=n2;
        System.out.println(result);
    }

    public static void max (double n1,double n2 ) {
        double result=0;
        if (n1 > n2)
            result=n1;
        else    
            result=n2;
        System.out.println(result);
    }

    public static void max (int n1,int n2,int n3 ) {
        int result=0;
        if (n1 > n2 && n1 > n3)
            result=n1;
        else if (n2 > n3)
            result=n2;
        else
            result=n3;
        System.out.println(result);
    }

    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        //int num1=0,num2=2;
        //System.out.println(sign (6));
        max (5,4);
        max (10.2,11);
        max (34,23,123);
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