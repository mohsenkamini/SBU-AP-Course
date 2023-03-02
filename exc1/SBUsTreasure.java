import java.util.Scanner;

public class SBUsTreasure {
    public static String reverseString (String s) {
    String result="";
    for (int i=s.length()-1; i >= 0; i--)
        result += s.charAt(i);
    return result;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String str = input.next();

        System.out.println(reverseString(str));
    }
}