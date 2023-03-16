import java.util.Scanner;
import java.util.regex.*;  

public class User {
    String username;
    String password;
    String email;

    User (String username,String password,String email) {
        this.username=username;
        this.password=password;
        this.email=email;
    }

    public static boolean checkUsername (String s) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]{8,}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static boolean checkPassword (String s) {
        Pattern p = Pattern.compile("[a-zA-Z0-9_]{8,12}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static boolean checkEmail (String s) {
        Pattern p = Pattern.compile("[a-zA-Z0-9_]{5,}@gmail.com");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static void printEmailUsername (String s) {
        for (int i=0 ; s.charAt(i)!='@' ; i++)
            System.out.print(s.charAt(i));
    }
    public static void increaseArraySize () {
        
    }

    public static void main (String[] args){

        //System.out.println(checkUsername("samE1234"));
        //System.out.println(checkPassword("sa_m_E12___4"));
        System.out.println(checkEmail("saE_4@gmail.com"));
        printEmailUsername("saE_4@gmail.com");
    }
}