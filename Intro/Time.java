import java.util.Scanner;


public class Time {
    public static void main (String[] args) {
        System.out.print ("Enter a double value: ");
        
        Scanner input = new Scanner (System.in);
        int seconds = input.nextInt();

        int minute = seconds / 60 ;
        seconds -= minute*60;


        System.out.println("minute: " + minute + " seconds: " + seconds );
    }
}