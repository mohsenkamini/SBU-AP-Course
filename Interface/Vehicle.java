
// pure abstraction
interface Vehicle {
    
    void run();
    int speed=50;
    public static void main (String[] args) {
        Test.main();
    }
}

class Car implements Vehicle {
    public void run() {
        System.out.println("The car is running... ghan ghan");
    }
}

abstract class Bike implements Vehicle {
    
}

class MountainBike extends Bike {
    public void run() {
        System.out.println("The Mountain bike is running... ghan ghan");
    }
}

class RacingBike extends Bike {
    public void run() {
        System.out.println("The Racing bike is running... ghan ghan");
    }
}

class Test {
    public static void main () {
        Vehicle v1 = new Car();
        Vehicle v2 = new MountainBike();
        Vehicle v3 = new RacingBike();

        v1.run();
        v2.run();
        v3.run();

    }   
}