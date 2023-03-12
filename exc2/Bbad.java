import java.util.Scanner;
import java.util.regex.*;  

public class Bbad {
    public static boolean checkForLetters (String s) {
        Pattern p = Pattern.compile(".*[a-zA-Z]+.*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static boolean checkForNumbers (String s) {
        Pattern p = Pattern.compile(".*[0-9]+.*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static boolean checkForBinary (String s) {
        Pattern p = Pattern.compile(".*[0-1]+.*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static boolean checkForNoBinary (String s) {
        Pattern p = Pattern.compile(".*[2-9]+.*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static boolean checkForSharp (String s) {
        Pattern p = Pattern.compile(".*#+.*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static boolean checkForNotNumbersNotLettersNotSharp (String s) {
        Pattern p = Pattern.compile(".*[^a-zA-Z0-9#]+.*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static boolean isSandewitch (String s) {
        if (s.length() % 3 == 0)
            if (checkForSharp(s))
                if (! checkForNumbers(s))
                    return true;
        return false;
    }
    public static int findNumberOfChar(String s, char ch) {
        int result=0;
        for (int i =0 ; i < s.length() ; i++)
            if (s.charAt(i) == ch)
                result++;
        
        return result;
    }
    public static boolean isPizza (String s) {
        if (findNumberOfChar(s,'#') % 7 == 0)
            if (checkForLetters(s) || checkForSharp(s))
                if (! checkForNumbers(s))
                    return true;
        return false;
    }
    //public static long convertString_BinaryToDec (String s) {
    //    long result=0;
    //    for (int i = s.length()-1 ; i >=0 ; i--)
    //        if (s.charAt(i)== '1')
    //            result += (Math.pow(2,s.length() - i - 1 ));
    //    return result;
    //}
    public static boolean isSeafood (String s) {
        if (checkForBinary(s))
            if (!checkForLetters(s))
                if (!checkForNoBinary(s))
                    if (s.charAt(0) == '1')
                        if (s.charAt(s.length()-1) == '0' && s.charAt(s.length()-2) == '0')
                            return true;
        return false;
    }
    public static void main (String[] args) {
        //System.out.println(checkForLetters("1234"));
        //System.out.println(checkForNumbers("as1d"));
        //System.out.println(checkForNotNumbersNotLettersNotSharp("as#^1d"));
        Scanner input = new Scanner (System.in);
        
        //for (int i=0 ; i < 3 ; i++) {
            String s = input.nextLine();
            if (checkForNotNumbersNotLettersNotSharp(s))
                System.out.println("Other");
            else if (isPizza(s))
                System.out.println("Pizza");
            else if (isSandewitch(s))
                System.out.println("Sandwich");
            else if (isSeafood(s))
                System.out.println("Seafood");
            else
                System.out.println("Other");
        //}
        //System.out.println(isSandewitch(s));
        //System.out.println(isPizza(s));
        //System.out.println(isSeafood(s));
        //System.out.println(findNumberOfChar(s,'#'));
        //System.out.println(convertString_BinaryToDec(s));

    }
}