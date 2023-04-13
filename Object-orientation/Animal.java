import java.util.Scanner;

public class Animal {
    String name="animal1";
    void printName () {
        System.out.println("The name is "+this.name);
    }
    void display() {
        System.out.println("This is an animal");
    }
    public static void main (String[] args) {
        TestAnimal.main();
    }
}
class Cat extends Animal {
    String color="black";
    void printColor () {
        System.out.println("The color is "+this.color);
    }
    void display() {
        System.out.println("This is a cat");
    }

}
class Dog extends Animal {
    int size ;
    void printSize () {
        System.out.println("The size is " + this.size);
    }
    void display() {
        System.out.println("This is a dog");
    }
}
class BabyCat extends Cat {
    double weight=1.2;
    void printWeight () {
        System.out.println("The weight is " + this.weight);
    }
}

class TestAnimal {
    public static void main() {
        Scanner input = new Scanner(System.in);
        Animal a1 = new Animal();
        a1.printName();
        a1.display();

        Cat c1 = new Cat();
        c1.printName();
        c1.display();
        c1.printColor();

        Animal a2 = new Cat();
        a2.printName();
        a2.display();
        //a2.color="some";
        //a2.printColor(); // cannot be called because the remote is Animal

        //Cat c2 = a2; // not the proper way to downcast
        //c2.printColor();

        Object c3 = new BabyCat();
        //c3.
        System.out.println("How many animals?: ");
        int numberOfAnimals= input.nextInt();

        Animal[] aList = new Animal[numberOfAnimals];
        System.out.println("How many cats?: ");
        int cats = input.nextInt();

        System.out.println("How many dogs?: ");
        int dogs = input.nextInt();

        for (int i=0 ; i < cats ; i++)
            aList[i]=new Cat();
        
        for (int i=cats ; i < cats+dogs ; i++)
            aList[i]=new Dog();
        
        for (int i=cats+dogs ; i < aList.length ; i++)
            aList[i]=new BabyCat();
        
        for (int i=0 ; i < aList.length ; i++)
        {
            System.out.println(aList[i]);
            if (aList[i] instanceof Dog)
            {
                Dog d1= (Dog) aList[i];
                d1.printName();
                d1.display();
                d1.printSize();
            }
            else if (aList[i] instanceof BabyCat)
            {
                BabyCat bc= (BabyCat) aList[i];
            }
            else if (aList[i] instanceof Cat)
            {    
                Cat c= (Cat) aList[i];
            }
        }
    }
}
