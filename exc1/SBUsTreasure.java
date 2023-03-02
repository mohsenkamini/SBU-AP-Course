import java.util.Scanner;
public class SBUsTreasure {

    public static String translateM (String str) {
        String result="";
        String tmp="";
        for (int i=0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) == 'M')
            {
                i++;
                for (int j=1; i < str.length() && j <= 3 ; j++ , i++)
                    tmp+= str.charAt(i);
                i--;    // because the main for does i++ too
            }
            else
            {
                result += str.charAt(i);
            }
        }
        result += tmp;
        return result;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String str = input.next();

        System.out.println(translateM(str));

    }
}