import java.util.Scanner;
import java.util.regex.*;  

public class Bank {
    public static boolean checkURL (String s) {
        Pattern p = Pattern.compile("[A-Z][a-zA-Z]{1,}:[a-zA-Z]{3}\\.[a-zA-Z0-9_]{2,10}\\.\\b(?:com|net|org|ir)\\b/[0-9]{13,19}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static int sumOfDigits (int n,int nod) {
        // nod = number of digits
        // there is no need for this to be recursive 
        // since the inputs are not gonna exceed 18
        int result=0;
        for (int i=0 ; i < nod ; i++  )
        {
            result+=n % 10;
            n/=10;
        }
        return result;
    }
    public static boolean lunCheck (String s) {
        boolean result=false;
        int checksum=0;
        for (int i = s.length() -2, j=0 ; i>=0 ; i--,j++)
        {
            int temp = s.charAt(i) - '0';
            if (j % 2 == 0)
                checksum += sumOfDigits(2 * temp,2);
            else
                checksum += temp;
        }
        checksum = (10 - (checksum % 10)) % 10;
        System.out.println(checksum);
        if (checksum == s.charAt(s.length()-1) - '0')
            result=true;
        return result;
    }
    public static void main (String[] args) {

        System.out.println(checkURL("Mellat:www.rb24.ir/4111111111111111"));
        System.out.println(sumOfDigits(9,2));
        System.out.println(lunCheck("4333"));
    }
}