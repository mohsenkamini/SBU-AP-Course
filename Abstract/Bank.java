abstract class Bank {

    abstract int getInterest ();
    public static void main (String[] args) {
        TestBank.main();
    }

}

abstract class Khosusi extends Bank {
    //int getInterest () {
    //    return 15;
    //}
    abstract void cInsurance ();
}

class Parsian extends Khosusi {
    int getInterest () {
        return 15;
    }
    void display() {
        System.out.println(this.getInterest());
    }
    void cInsurance() {
        System.out.println("we have insurance");
    }
}

class Melli extends Bank {
    int getInterest () {
        return 16;
    }
}

class TestBank {
    public static void main () {
        Parsian b1 = new Parsian();
        Bank b2 = new Melli();
        //Bank b3 = new Bank();  we cannot make an abstract object
        System.out.println(b1.getInterest());
        System.out.println(b2);
        b1.display();
        b1.cInsurance();

        Bank [] blist = new Bank[100];
        blist[0] = new Parsian();
    }
}