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
    void display () {
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
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
        Pattern p = Pattern.compile("[a-zA-Z0-9_]{5,}@gmail\\.com");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static void printEmailUsername (String s) {
        for (int i=0 ; s.charAt(i)!='@' ; i++)
            System.out.print(s.charAt(i));
    }
    public static User[] incrementArraySize (User[] source) {
        User[] copy = new User[source.length + 1];
        System.arraycopy(source, 0, copy, 0, source.length);
        return copy;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        User[] list = new User[1];

        do {
            String command = input.nextLine();
            if (command.equals("Sign up"))
            {
                String tempUsername = input.nextLine();
                String tempPassword = input.nextLine();
                String tempEmail = input.nextLine();
                if (checkUsername(tempUsername) && checkPassword(tempPassword) && checkEmail(tempEmail))
                {
                    System.out.println("Successful");
                    list[list.length-1] = new User (tempUsername,tempPassword,tempEmail);
                    list=incrementArraySize(list);
                }
                else
                    System.out.println ("Invalid information");
            }
            else if (command.equals("Log in"))
            {

            }
        } while (input.hasNextLine());
        //list[0] = new User ("mohsen0","123123123","mohsen@gmail.com");
        //list[1] = new User ("mohsen1","123123123","mohsen@gmail.com");
        //list[0].display();
        //list[1].display();
        //System.out.println(checkUsername("samE1234"));
        //System.out.println(checkPassword("sa_m_E12___4"));
        //System.out.println(checkEmail("saE_4@gmail.com"));
        //printEmailUsername("saE_4@gmail.com");

    }
}