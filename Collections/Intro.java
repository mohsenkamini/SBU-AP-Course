import java.util.*;
public class Intro {
    public static void main (String[]args)    {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("moshe");
        al1.add("moshe");
        al1.add("mehdi");
        al1.add("mmd");

        System.out.println(al1.get(2));
        System.out.println(al1.indexOf("ali"));
        System.out.println(al1.lastIndexOf("moshe"));

        al1.remove(1);
        al1.set(1, "reza");
        //while (itr.hasNext())
        //    System.out.println(itr.next());

        ArrayList<String> al2 = new ArrayList();
        al2.add("esm1");
        al2.add("esm2");
        al2.add("esm3");

        System.out.println(al1);
        System.out.println(al2);
        
        Collections.fill(al2,"esm");
        System.out.println(al2);

        Collections.copy(al2, al1);

        System.out.println(al1);
        System.out.println(al2);

        System.out.println(Collections.max(al1));
        System.out.println(Collections.min(al1));
        Collections.reverse(al1);
        System.out.println(al1);

        Collections.sort(al1);
        System.out.println(al1);

        Collections.shuffle(al1);
        System.out.println(al1);

        al1.add("char");
        al1.add("panj]");

        ArrayList<String> al3 = new ArrayList<String>(al1.subList(1, 4));
        System.out.println(al3);

        al2.addAll(al3);            // concatinate
        System.out.println(al3);
        System.out.println(al2);

        for (int i=0 ; i < al2.size() ; i++)
            System.out.println( al2.get(i));
        
        Enumeration<String> e = Collections.enumeration(al2);
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

        List slist = Collections.synchronizedList(al2);
        Iterator itr = slist.iterator();

        slist.add("arg0");
        slist.add("arg1");
        synchronized (slist){};
        synchronized (this) {
            while (itr.hasNext())
                System.out.println(itr.next());
        }


    } 
}
