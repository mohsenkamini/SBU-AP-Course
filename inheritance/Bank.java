public class Bank {
    public int getRateOfInterest() {
        return 5;
    }
    public static void main (String[] args) {
        BankTest.main();
    }
}
class Melli extends Bank {
    public int getRateOfInterest() {
        return 1;
    }
}

class Saderat extends Bank {
    public int getRateOfInterest() {
        return 10;
    }
}

class Maskan extends Bank {
    public int getRateOfInterest() {
        return 20;
    }
}
class BankTest {
    // static methods are bind to class
    // dynamic methods are bind to objects and we
    // can override them.
    public static void main() {
        Bank b1 = new Bank();       
        System.out.println(b1.getRateOfInterest());
        
        Bank b2 = new Melli();      // upcasting
        System.out.println(b2.getRateOfInterest());
        
        Bank b3 = new Saderat();
        System.out.println(b3.getRateOfInterest());

        Bank b4 = new Maskan();
        System.out.println(b4.getRateOfInterest());
        
    }
}