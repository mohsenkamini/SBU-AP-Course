import java.util.Scanner ;

public class Square {
    int length;
    String color;

    Square (int l, String c) {
        length=l;
        color=c;
    }
    Square (int l) {
        length=l;
    }
    int getArea() {
        return length*length;
    }
    void display() {
        for (int i=1; i<= length ; i++)
            System.out.print("-");
        System.out.println("");
        for (int j=2; j < length ; j++)
        {
            for (int i=1; i<= length ; i++)
            {
                if (i==1 || i==length)
                    System.out.print("|");
                else
                    System.out.print("^");
            }
            System.out.println("");
        }
        for (int i=1; i<= length ; i++)
            System.out.print("-");
        System.out.println("");
    }

    public static void main (String[] args) {
        squareTest.main();
    }
}

class squareTest {
    public static void main () {
        //Scanner input = new Scanner (System.in);
        //Square square1 = new Square (12,"white");
        //square1.display();
    Long decimal  =new BigInteger("7c100a20", 16).longValue();
    String binary1 = java.lang.Long.toBinaryString(decimal);
    System.out.println(binary1);
    int intBits = Integer.parseInt(binary1, 2);
    float myFloat = Float.intBitsToFloat(intBits);
    System.out.println( myFloat);
    }
}