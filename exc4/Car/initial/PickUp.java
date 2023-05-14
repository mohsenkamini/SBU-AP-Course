public class PickUp extends BodyType{
    //public int score = 100+50;
    //public int price = 1000+1000;
    public int score () {
        return 100+50;
    }
    public int price () {
        return 1000+1000;
    }
    
    public static void main (String[] args) {
        BodyType b1 = new BodyType();
        PickUp b2 = new PickUp();
        System.out.println(b1.price());
        System.out.println(b1.score());
        System.out.println(b2.price());
        System.out.println(b2.score());
    }
}