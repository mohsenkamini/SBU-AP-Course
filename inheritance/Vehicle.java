//class Circle extends GeometricObjects {
//
//    // override a parent's method
//}

public class Vehicle {
    public void run() {
        System.out.println("The vehicle is running.");
    }
    public static void main (String[] args) {
        Bike.main();
    }
}
class Bike extends Vehicle {
    public void run() {
        System.out.println("The bike is running");
    }
    public static void main () {
        Bike b = new Bike();
        b.run();
    }
}