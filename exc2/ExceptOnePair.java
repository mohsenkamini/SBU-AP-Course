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
            result = n2/n1;
        //System.out.println("n1: " + n1 + " n2: " + n2 + " result: "+ result);
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
    //public static int[] getPairResults (int[] array, int crossPairIndex) {
    public static int getPairResults (int[] array, int crossPairIndex) {
        /*This method supposes the pairs are next to each other in the array
          meaning array[0] and array[1] are pairs and so on ... */

        //int[] result = new int[array.length/2];
        int result =0;
        for (int i=0 ; i < array.length ; i+=2)
        {
            if (i/2 == crossPairIndex)
                //result[i/2] = array[i]*array[i+1];
                result += array[i]*array[i+1];
            else
                //result[i/2] = getMaxPairDivide(array[i],array[i+1]);
                result += getMaxPairDivide(array[i],array[i+1]);
        }
        return result;
    }
    //public static int sumOfArray (int[] array) {
    //    int result=0;
    //    for (int i =0 ; i < array.length ; i++)
    //        result+=array[i];
    //    return result;
    //}
    public static int maxPairResult (int[] array) {
        /*This method recieves a paired array as 
          input and outputs the max sum possible. */
        int result=0;
        int temp;
        for (int i=0 ; i < array.length/2 ; i++) {
            temp=getPairResults(array,i);
            if (result < temp)
                result=temp;
        }
        return result;
    }
    public static void bubble_sort (int[] array,int size) {
        if (size == 0)
            return;
        for (int i =0 ; i < size-1 ; i++)
        {
            if (array[i+1] < array[i])
            {
                // swap
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        bubble_sort(array,size-1);
    }
    public static int getMethod2Result (int[] array) {
        int result=0;
        bubble_sort(array,array.length);
        int temp[] = new int[array.length-2];
        System.arraycopy(array,0,temp,0,array.length-2);
                            //   (src,from_index,dst,from_index_dst,how_many)
        result += array[array.length-1] * array[array.length-2] ;
        int tempPaired[] = pairMethod1(temp);
        //printArray(tempPaired);
        result += getPairResults(tempPaired,-1); // -1 means there are no * actions and only divides
        return result;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int size = input.nextInt();
        int array[] = inputFillArrayInt(size);
        int pairedArray[] = pairMethod1(array);
        System.out.println(maxPairResult(pairedArray)); // the rigth answer to method1  
        //printArray(pairedArray);
        System.out.println(getMethod2Result(pairedArray));

    }
}