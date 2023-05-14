import java.util.Scanner;
public class WaterTank {
    static int capacity (int[] array) {
        int result=0;
        int startIndex=0;
        int max=array[0];
        for (int i=1 ; i < array.length ; i++) {
            if ((i == array.length-1 )&& (array[i] < max))
            {
                for (int j=startIndex+1 ; j < i; j++ )
                {
                    result -= max - array[j] ;
                    if (array[i]-array[j] > 0)
                        result+=array[i]-array[j];
                }
            }
            else 
            {   
                if (array[i] >= array[startIndex]) {
                    startIndex=i;
                    max=array[i];
                }
                else result += max - array[i];
            }
        }
        return result;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        if (n<0)
        {
            System.out.println(0);
            return ;
        }
        int [] array = new int[n];
        for (int i=0 ; i < n ; i++)
            array[i] = input.nextInt();
        try {
            System.out.println(capacity (array));
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(0);
        }
    }
}
