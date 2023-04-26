import java.util.Scanner;
public class Array2d {
    public static void main (String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0][0] = 3;
        Scanner input = new Scanner(System.in);
        for (int i=0 ; i < matrix.length ; i++)
            for (int j=0 ; j < matrix[i].length ; j++)
            matrix[i][j] = (int) (Math.random()*1000);
        
        // int[][] array = {
            // {1,2,3},
            // {4,5,6},
            // {7,8,9}
        // };

        int[][] list = {
            {1,2,3},
            {3,4},
            {6}
        };
        System.out.println(list[1][1]);

        int rows = input.nextInt();
        //int columns = input.nextInt();
        int[][] array = new int[rows][];
        for (int i=0 ; i<array.length ; i++) {
            System.out.println("enter the size of row." + i +": ");
            int columns = input.nextInt();
            array[i] = new int[columns];
            for (int j=0 ; j < array[i].length ; j++)
            {
                array[i][j] = (int) (Math.random()*1000);
                System.out.print(array[i][j]+",");
            }
            System.out.println("");
        
        for (int i=0 ; i<array.length ; i++) {
            for (int j=0 ; j < array[i].length ; j++)
            {
                int rRandom = (int) (Math.random()*array.length);
                int cRandom = (int) (Math.random()*array[rRandom].length);
            }
        }
                    


        }


    }
}