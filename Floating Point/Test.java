import java.util.Scanner;


public class Test {
    public static void main (String[] args) {
    
    //int i = 123456789;
    //// byte b = i; compile error
    ////byte b = (byte) i;
    //float f =i ;
    //i = (int) f;
    ////System.out.println( i );
    //int m = 'a';
    //char ch = 102 ;
    //char letter = 'A'; // ASCII 
    //char letter2 = '\u0041'; // unicode 16 bit
//
    //System.out.println( ++letter );
    //System.out.println( letter2 );
    //System.out.println( ch );
//
    //int num1 = (int) (Math.random() * 10);
    //int num2 = (int) (Math.random() * 10);
//
    //System.out.println( "What is " + num1 + "+" + num2 + "?:" );
//
    //
    Scanner input = new Scanner (System.in);
    int answer = input.nextInt();

    boolean flag5 = answer%5 == 0;
    boolean flag2 = answer%2 == 0;

    // | forces both statements to be calculated
    // but || if the first statement is true does not 
    // calculate the second statement
    if (flag5 || flag2) {
        System.out.println( "HiFive" );
    }
    if (flag2 ^ flag5) {
        System.out.println( "HiEven" );
    }
    else {
        System.out.println( "Hmm" );

    }
        System.out.printf( "some  %b", flag5 );
    }
    
}