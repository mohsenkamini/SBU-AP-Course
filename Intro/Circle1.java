public class Circle1 {
    public static void main (String[] args) {
        int radius=234;
        double area , perimeter;
        area = radius * radius * Math.PI ;
        perimeter = 2 * radius * Math.PI ;

        System.out.println("for circle with radius: " + radius + " area equals: " + area + " and perimeter equals to: " + perimeter );
    }
}