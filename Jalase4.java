import java.util.Scanner;


public class Jalase4 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int sentinel=0;
        int sum=0 , answer=1;
        while (answer != sentinel){
            answer = input.nextInt();
            sum+=answer;
            
        }
        System.out.print ("Sum is " + sum);

        /*String s="\n";
        int correctCounter=0;
        int numCounter=5;
        long startTime = System.currentTimeMillis();
        
        while (numCounter > 0) {
            int num1 = (int) (Math.random()*21);
            int num2 = (int) (Math.random()*21);
            s+="what is " + num1 + " + " + num2 + "? ";
            System.out.print ("what is " + num1 + " + " + num2 + "? : ");
            int answer = input.nextInt();
            if (answer == num1 + num2)
                s+=answer + " is correct\n";
            else
                s+=answer + " is not correct\n";

            numCounter--;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.print ( s+ "duration: " + duration/1000);
        */
        /*
        int num = (int) (Math.random()*101);
        int guess=-1;
        while (guess != num) {
            System.out.print ("Enter a number between 0 to 100: ");

            guess = input.nextInt();

            if (guess < num)
                System.out.print ("your guess was lower than what we randomely generated ");
            else if (guess > num)
                System.out.print ("your guess was higher than what we randomely generated ");
                else 
                    System.out.print ("your guess was just right ");
        /*    

        }
        /*int count=0;
        while (count < 100) {
            System.out.println ("ehem");
            count++;
        }
        */
        /*
        // arithmetic shift >>
        // logical shift >>
        int x=-4;
        int y = (x>>>2);
        System.out.print (y);
        */
        /*boolean kabise=false;
        System.out.print ("Enter year: ");
        
        Scanner input = new Scanner (System.in);
        int year = input.nextInt();

        System.out.print ("Enter month: ");

        int month = input.nextInt();

        int days=0;
        switch (month)
        {
            case 1: 
                days=31;
                break;
            case 2: 
                days=31;
                break;
            case 3: 
                days=31;
                break;
            case 4: 
                days=31;
                break;
            case 5: 
                days=31;
                break;
            case 6: 
                days=31;
                break;
            case 7: 
                days=30;
                break;
            case 8: 
                days=30;
                break;
            case 9: 
                days=30;
                break;
            case 10: 
                days=30;
                break;
            case 11: 
                days=30;
                break;
            case 12:
                if (kabise) 
                    days=30;
                else
                    days=29;
                break;
            default:
                System.out.println("month number should be in range of 1 to 12" );
                break;
        }



        System.out.println("for month number " + month + " there are " + days + " days" );
        */
    }
}