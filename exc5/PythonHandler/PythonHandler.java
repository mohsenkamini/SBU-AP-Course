import java.util.regex.*;

public class PythonHandler {
    public static void main(String[] args) {
        // checkInNum
        System.out.println(checkInNum("1,1,2,3,4,,4#"));
        System.out.println(checkNullNum("1,1,2,3,4,4,"));
        System.out.println(checkInLength(4,"1,2,3,4,5"));
        try {
        checkArray(4,"1,2,3,4,5m");
        //checkArray(4,"1,2,3,4,,,");
        //checkArray(4,"1,2,3,4");
        }
        catch (InvalidNumberException a) {
            System.out.println("inv n");
        }
        catch (NullNumberException b) {
            System.out.println("null");
        }
        catch (InvalidLengthException c) {
            System.out.println("inv len");
        }

    }
    public static boolean checkInNum (String s) {
        Pattern p = Pattern.compile("[0-9,]{1,}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return !b;
    }

    public static boolean checkNullNum (String s) {
        Pattern p = Pattern.compile(".*[,]{2,}.*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }

    public static boolean checkInLength (int n,String s) {
        int counter=1;
        for (int i=0 ; i < s.length() ; i++)
            if (s.charAt(i) == ',')
                counter++;
        if (counter == n)
            return false;
        return true;
    }

    public static String checkArray(int n, String list) throws InvalidNumberException, NullNumberException, InvalidLengthException{
        if (checkInNum(list))
            throw new InvalidNumberException("Numbers are INVALID");
        if (checkNullNum(list))
            throw new NullNumberException("NULL number found");
        if (checkInLength(n, list))
            throw new InvalidLengthException("Size of array is INVALID");
        
        return "this class can handle python BUG!";
    }
}
