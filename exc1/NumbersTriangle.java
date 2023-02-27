import java.util.Scanner;


public class NumbersTriangle {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int max=5000;
        int counter=1;
        int i=1,j=0;
        int n= input.nextInt();

        do {
            while (j < counter)
            {
                j++;
                if (n == i)
                {
                    int temp=counter-j+1;
                    //System.out.println("counter: " + counter + " j: " + j );
                    if (counter % 2 == 0)
                        System.out.print(j + " " + temp);
                    else
                        System.out.print(temp + " " + j);
                    
                }
                i++;
            }

//            System.out.print("\n");
            counter++;
            j=0;
        } while (i < max);

    }
}