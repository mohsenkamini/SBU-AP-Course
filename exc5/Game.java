import java.util.Scanner;
public class Game {
    static int ballPointCal (char[][] array,int i,int j,int result) {
        if (j<0 || j >= array[0].length || i >= array.length)
            return result;

            switch(array[i][j]) {
                case '\\':
                    return ballPointCal(array, i+1, j+1, result);
                case '/':
                    return ballPointCal(array, i+1, j-1, result);
                case '.':
                    return ballPointCal(array, i+1, j, result);
                default:
                    return ballPointCal(array, i+1, j, result+(int )(array[i][j] - '0'));
            }
    }

    static int ballBasket (char[][] array,int i,int j,int result) {
        if (j<0 || j >= array[0].length || i >= array.length)
            return result;

        switch(array[i][j]) {
            case '\\':
                return ballBasket(array, i+1, j+1, result+1);
            case '/':
                return ballBasket(array, i+1, j-1, result-1);
            default:
                return ballBasket(array, i+1, j, result);
        }
    }
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char[][] array = new char[n][m];
        
        for (int i=0 ; i < n ; i++)
            for (int j=0 ; j < m ; j++)
                array[i][j] = input.next().charAt(0);

        //for (int i=0 ; i < n ; i++)
        //    for (int j=0 ; j < m ; j++)
        //        System.out.print(array[i][j]);
             
        
        for (int j=0; j<m ; j++)
            System.out.print( ballBasket(array, 0, j, j+1) + " ");

        System.out.println("");

        for (int j=0; j<m ; j++)
            System.out.print( ballPointCal(array, 0, j, 0) + " ");        

    }
}
