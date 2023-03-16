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
        if (n1==0 || n2 ==0)
            return 0;
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
    public static int countNegatives (int[] array) {
        int result=0;
        for (int i=0 ; i < array.length ; i++)
            if (array[i] < 0 )
                result++;
        return result;
    }
    public static int[] negatizeArray (int[] array) {
        int[] result = new int [array.length];
        for (int i=0 ; i < array.length ; i++ )
            result[i]= -array[i];
        return result;
    }
    public static int getMethod2Result (int[] array) {
        int result=0;
        bubble_sort(array,array.length);
        int negativeCount = countNegatives(array);
        if (negativeCount == array.length)
        {
            array=negatizeArray(array);
            bubble_sort(array,array.length);
            negativeCount=0;
        }
        if (negativeCount > 0 )
            result=getMethod2NegativeResult(array,negativeCount);
        else
            result=getMethod2PositiveResult(array);
        return result;
    }
    public static int getMethod2PositiveResult (int[] array) {
        int result=0;
        int temp[] = new int[array.length-2];
        System.arraycopy(array,0,temp,0,array.length-2);
                            //   (src,from_index,dst,from_index_dst,how_many)
        result += array[array.length-1] * array[array.length-2] ;
        int tempPaired[] = pairMethod1(temp);
        //printArray(tempPaired);
        result += getPairResults(tempPaired,-1); // -1 means there are no * actions and only divides
        return result;
    }
    public static int[] putInPairArray(int[] array, int i1,int i2) {
        int[] result = new int[2];
        result[0]=array[i1];
        result[1]=array[i2];
        return result;
    }
    public static int getMethod2NegativeResult (int[] array, int negativeCount) {
        int result=0;
        boolean negArray=false;
        int negArrayLength=0;
        int mixedArrayLength=0;
        boolean mixedArray=false;   // points to a pair array consisted of one neg and one positive number
        if (negativeCount != 1)
            if (negativeCount % 2 == 1)
                negArrayLength=negativeCount-1;
            else
                negArrayLength=negativeCount;
        int[] negatives = new int [negArrayLength]; 
        int[] mixed = new int [2];

        if (negativeCount == 1)
        {
            mixedArrayLength=2;
            mixedArray=true;
            mixed=putInPairArray(array,0,1);
        }
        else
        {
            negArray=true;
            if (negativeCount % 2 == 1)
            {
                mixedArrayLength=2;
                System.arraycopy(array,0,negatives,0,negArrayLength);
                mixedArray=true;
                System.arraycopy(array,negArrayLength,mixed,0,2);
            }
            else
                System.arraycopy(array,0,negatives,0,negArrayLength);
        }
        int posArrayLength = array.length - negArrayLength - mixedArrayLength ; 
        int positives[] = new int [posArrayLength];
        int posFirstIndex = negArrayLength+mixedArrayLength;
        System.arraycopy(array,posFirstIndex,positives,0,posArrayLength);
        System.out.println ("Here: pos:" +  posArrayLength + " neg: " + negativeCount + " first: " + posFirstIndex + " mixed: " + mixedArrayLength);
        printArray(negatives);
        printArray(mixed);
        printArray(positives);
        if (mixedArray) 
            result += getMaxPairDivide(mixed[0],mixed[1]);
        if (negArray)
        {
            if (negatives[0]*negatives[1] > positives[positives.length-1]*positives[positives.length-2])
            {
                result+=negatives[0]*negatives[1];
                result+=getPairResults(positives,-1);
                if (negArrayLength-2 > 0)
                {
                    int temp[] = new int [negArrayLength-2];
                    System.arraycopy(negatives,2,temp,0,temp.length);
                    result+=getPairResults(temp,-1);
                }
            }
            else
            {
                result+=positives[positives.length-1]*positives[positives.length-2];
                result+=getPairResults(negatives,-1);
                if (posArrayLength-2 > 0)
                {
                    int temp[] = new int [posArrayLength-2];
                    System.arraycopy(positives,2,temp,0,temp.length);
                    result+=getPairResults(temp,-1);
                }
            }

        }
        

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
        //System.out.println("0\n0");
    }
}