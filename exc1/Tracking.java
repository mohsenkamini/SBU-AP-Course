import java.util.Scanner;

public class Tracking {

    public static int convertCharToInt (char c) {
        return c - 0x30;
    }

    public static int findKey (String s) {
        return convertCharToInt(s.charAt(s.length()-1));
    }

    public static void decodeString (String s, int key) {
        for (int i=0 ; i*key < s.length()-1 ; i++) {
            System.out.print(s.charAt(0+(i*key)));
        }
    }

    public static double changeNumSystem (String s,int base) {
        double result=0;
        for (int i=(s.length()-2), j=0 ; i >= 0 ; i-- , j++)
        {
            result += (convertCharToInt (s.charAt(i)) * Math.pow(base,j));
        }
        return result;
    }



    public static void main (String[] args) {
        
        Scanner input = new Scanner (System.in);
        String s1 = input.next();
        String s2 = input.next();

        decodeString(s1,findKey(s1));

        System.out.print(" ");

        System.out.print((int) (changeNumSystem(s2,findKey(s2)) % 10 ));



    }
}