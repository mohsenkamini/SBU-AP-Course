import java.util.Scanner;

public class Peykan {

    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int j=1;
        for (int i=1 ; i <= ((2*n)-1) ; i++){
            if (i <= n)
            {
                for (j=0; j < n-i ; j++)
                {
                    System.out.print("  ");
                    if (n-j >= 10)
                       System.out.print(" ");
                }
                for (; j < n ; j++)
                {
                    System.out.print(n-j);
                    if (n-j != 1)
                        System.out.print(" ");

                }
            }
            else {
                for (j=0; j < i-n ; j++)
                {
                    System.out.print("  ");
                    if (n-j >= 10)
                       System.out.print(" ");
                }
                for (; j < n ; j++)
                {
                    System.out.print(n-j);
                    if (n-j != 1)
                        System.out.print(" ");

                }
            }
            if (i != ((2*n)-1))
                System.out.print("\n");
        }
    }
}