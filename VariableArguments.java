import java.util.Arrays;
import java.util.ArrayList;

public class VariableArguments {
    public static int sum (int ... values) {
        int result=0;
        for (int i=0 ; i < values.length; i++)
            result+=values[i];

        return result;
    }
    public static void display (String ... strs) {
        for (int i=0 ; i < strs.length; i++)
            System.out.print(strs[i] + " ");
        System.out.println("");
    }

    //public static void display (String ... strs,int ... str) {    // this is not possible
    //    for (int i=0 ; i < strs.length; i++)
    //        System.out.print(strs[i] + " ");
    //    System.out.println("");
    //}
     
    public static void main (String[] args) {
        System.out.println(sum(1,7));
        System.out.println(sum(3));
        System.out.println(sum(4,5,6,7));
        System.out.println(sum(21,11,121,2223));
        display();
        display("mohsen");
        display("mosen","is");
        display("mosen","is", "the" , "best");
        int[] a = {1,10,3,4,5};
        int location = Arrays.binarySearch(a,2);
        System.out.println(location);

        ArrayList<String> al1 = new ArrayList<String>() ;
        al1.add("Mohsen");
        al1.add("Mani");
        al1.add("MohsenMani");
        al1.add("Mohammad Mohsen");
        for (int i=0 ; i < al1.length; i++)
            System.out.println(al1[i]);
        Iterator
            
        
    }
}