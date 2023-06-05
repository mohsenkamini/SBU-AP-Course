import java.util.*;
public class Jadid {
    public static void main (String[] args) {
        Set s1 = new HashSet<String>();
        s1.add("arg0");
        s1.add("jamshid");
        s1.add("mohsen");
        s1.add("arg0");
        s1.add("reza");

        Iterator itr = s1.iterator();

        // while (itr.hasNext())
            // System.out.println(itr.next());
        
        Integer num = new Integer(2023);
        Integer num2 = new Integer(2023);
        String str = new String("vahidi");
        System.out.println(num.hashCode());
        System.out.println(num2.hashCode());
        System.out.println(str.hashCode());
    }
}
