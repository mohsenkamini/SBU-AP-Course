import java.util.Scanner;
public class SBUsTreasure {

    public static String translateM (String str) {
        char ch='M';
        String result="";
        String tmp="";
        boolean flag=false;
        for (int i=0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) == ch && !flag )
            {
                flag=true;
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

    public static String translateD (String str) {
        char ch='D';
        String result="";
        boolean flag=false;

        for (int i=0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) == ch && !flag )
            {
                flag=true;
                i++;
                for (; i < str.length() ; i++)
                    switch (str.charAt(i)) {
                        case 'L':
                            result += 'l';
                            break;
                        case 'l':
                            result += 'L';
                            break;
                        case 'R':
                            result += 'r';
                            break;
                        case 'r':
                            result += 'R';
                            break;
                        default:
                            result += str.charAt(i);
                    }
            }
            else
                result += str.charAt(i);
        }
        return result;
    }

    public static String translateE (String str) {
        char ch='E';
        String result="";
        boolean flag=false;

        for (int i=0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) == ch && !flag )
            {
                flag=true;
                i++;
                for (int j = str.length()-1 ; j >= i ; j--)
                    result+=str.charAt(j);
                break;
            }
            else
                result += str.charAt(i);
        }
        return result;
    }
    public static String translateO (String str) {
        char ch='O';
        String result="";
        boolean flag=false;

        for (int i=0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) == ch && !flag )
            {
                flag=true;
                i++;
                for (; i < str.length() ; i++)
                    switch (str.charAt(i)) {
                        case 'L':
                            result += 'R';
                            break;
                        default:
                            result += str.charAt(i);
                    }
            }
            else
                result += str.charAt(i);
        }
        return result;
    }

    public static int translateDegree (char command,int currentDegree) {
        int limit=360;
        switch (command) {
            case 'l':
                currentDegree+=45;
                break;
            case 'L':
                currentDegree+=90;
                break;
            case 'r':
                currentDegree-=45;
                break;
            case 'R':
                currentDegree-=90;
                break;
            default:
                System.out.println("NOT A VALID COMMAND");
        }
        if (currentDegree >= limit)
            currentDegree-=limit;
        
        if (currentDegree < 0)
            currentDegree+=limit;
        return currentDegree;
    }

    public static String move (int x, int y, int degree) {
        switch (degree) {
            case 0:
                x++;
                break;
            case 45:
                x++;
                y++;
                break;
            case 90:
                y++;
                break;
            case 135:
                x--;
                y++;
                break;
            case 180:
                x--;
                break;
            case 270:
                y--;
                break;
            case 315:
                x++;
                y--;
                break;
            default:
                System.out.println("NOT A VALID DEGREE");
        }
        return x + " " + y;
    }
    public static boolean health (String str) {
        String checkAgainst="ERROR";
        String start="",end="";
        boolean result=true;
        for (int i=0 ; i < checkAgainst.length() ; i++)
        {
            start += str.charAt(i);
        }
        for (int i=str.length()-1 ,int j=0; j < checkAgainst.length() ; i--,j++)
        {
            start += str.charAt(i);
        }
        if (start == checkAgainst || end == checkAgainst )
            result=false;
        return result;
    }
    /*
    public static String translateMRecursive (String str) {
        String result=str;
        int counter=0;
        for (int i=0 ; i < str.length() ; i++)
            if (str.charAt(i) == 'M')
                counter++;

        for (int i=0 ; i < counter ; i++)
            result = translateM(result);
        return result;
    }
    */
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String str = input.next();
        int x=0,y=0,currentDegree=90;

        System.out.println(translateO(str));

    }
}