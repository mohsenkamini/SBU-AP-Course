interface Edible {
    void eat();
    public static void main(String[] args) {
        Test.main();
    }
}

class Animal {
    String name;
    String getName() {
        return this.name;
    }

}

class Chicken extends Animal implements Edible {
    public void eat() {
        System.out.println("Eat this");
    }
}

class Tiger extends Animal {

}

abstract class Fruit implements Edible {

}

class Apple extends Fruit {
    public void eat() {
        System.out.println("Eat this apple");
    }
}
class Orange extends Fruit {
    public void eat() {
        System.out.println("Eat this orange");
    }
}

class Test {
    public static void main () {
        Object[] objs = { new Tiger(),new Apple(),new Chicken(),new Orange() } ;
        for (int i=0 ; i < objs.length ; i++) {
            if (objs[i] instanceof Edible)
                ((Edible) objs[i]).eat();
        }
    }
}