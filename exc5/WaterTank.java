import java.util.Scanner;
public class WaterTank {
    static int calculateCapacity(int[] array){
        int result=0;
        for (int i=1; i < array.length-1 ; i++)
            result+=columnCapacity(array, i);
        return result;
    }
    static int columnCapacity (int[] array,int index) {
        int result=0;
        int leftMax=array[0];
        int rightMax=array[array.length-1];
        for (int i=index ; i < array.length ; i++)
            if (rightMax<array[i])
                rightMax=array[i];

        for (int i=index ; i >= 0 ; i--)
            if (leftMax<array[i])
                leftMax=array[i];
        
        if (leftMax<rightMax)
            result+=leftMax-array[index];
        else result+=rightMax-array[index];

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
            System.out.println(calculateCapacity (array));
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(0);
        }
    }
}
