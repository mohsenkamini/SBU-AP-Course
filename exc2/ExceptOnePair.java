import java.util.Scanner;

public class ExceptOnePair {


    public static int[] inputFillArrayInt (int size) {
        Scanner input = new Scanner (System.in);
        int result[] = new int [size];
        for (int i=0 ; i < size ; i++)
            result[i] = input.nextInt();
        return result;
            
    }
    public static void printArray (int[] array) {
        for (int i=0 ; i< array.length ; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }
    public static int getMaxPairDivide (int n1, int n2) {
        int result = n1/n2;
        if (result < n2/n1)
            result = n2/1;
        return result;
    }
    public static int[] pairMethod1 (int[] array) {
        int[] result = new int[array.length];
        for (int i=0 ; i < array.length/2 ; i++ )
        {
            result[2*i] = array[i];
            result[(2*i)+1] = array[array.length-1-i];
        }
        return result;
    }
    public static int[] getPairResults (int[] array, int crossPairIndex) {
        /*This method supposes the pairs are next to each other in the array
          meaning array[0] and array[1] are pairs and so on ... */

        int[] result = new int[array.length/2];
        for (int i=0 ; i < array.length ; i+=2)
        {
            if (i/2 == crossPairIndex)
                result[i/2] = array[i]*array[i+1];
            else
                result[i/2] = getMaxPairDivide(array[i],array[i+1]);
        }
        return result;
    }
    public static int sumOfArray (int[] array) {
        int result=0;
        for (int i =0 ; i < array.length ; i++)
            result+=array[i];
        return result;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int size = input.nextInt();
        int array[] = inputFillArrayInt(size);
        int pairedArray[] = pairMethod1(array);
        printArray(pairedArray);


    }
}