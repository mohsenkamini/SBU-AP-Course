import java.util.Scanner;

public class Palindrome {
    public static String reverseString (String s) {
    String result="";
    for (int i=s.length()-1; i >= 0; i--)
        result += s.charAt(i);
    return result;
    }

    public static String appendTerminatingChars (String s,int size,char ch) {
        String result="";
        for (int i=0; i < size ; i++)
            result+=ch;
        result+=s;
        for (int i=0; i < size ; i++)
            result+=ch;
        
        return result;
    }

    public static String findBiggestRun (String s1,String s2) {
        // strings should be within the same size
        String result="";
        String tmp="";
        //System.out.println(s1.length());
        for (int i=0 ; i < s1.length() ; i++) {
            if (s1.charAt(i) == s2.charAt(i))
                tmp+=s1.charAt(i);
            else
            {
                if (tmp.length() > result.length())
                    result=tmp;
                tmp="";
            }
            if (i == s1.length()-1 )
                if (tmp.length() > result.length())
                    result=tmp;
        }
        return result;
    }

    public static String findBiggestPalindrome (String str) {
        String rStr = reverseString(str);
        String extRStr = appendTerminatingChars(rStr,rStr.length()-1,'x');
        String result="";
        String tmpResult="";
        String partedExtRStr="";

        for (int i=0 ; i < (2*str.length())-1 ; i++)
        {
            for (int j= str.length()-1 ; j >= 0 ; j-- )
                partedExtRStr += extRStr.charAt( str.length() - 1 - j + i );
            
            //System.out.println(partedExtRStr);
            tmpResult = findBiggestRun(str,partedExtRStr);
            if (tmpResult.length() >= result.length())
                result=tmpResult;
            
            //System.out.println(result);

            partedExtRStr="";
            
        }
        return result;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String str = input.next();
        //String rstr=reverseString(str);
        String result = findBiggestPalindrome(str);
        System.out.println(Integer.parseInt(result));
        System.out.println(result.length());
        //System.out.println(rstr);
        //System.out.println(appendTerminatingChars(rstr,rstr.length()-1,'x'));
//
        //System.out.println(findBiggestRun("1234432","1x34431"));

    }
}