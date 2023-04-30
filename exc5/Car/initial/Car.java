public class Car {
    BodyType body;
    Engine engine;
    Wheel wheel;
    int tax = 100;
    public static void main(String[] args) {
        Car temp = createCar("BodyType","ecoBoost" ,"Wheel");
        for (int i=0 ; i < inPrSc.length ; i++) 
            System.out.println(inPrSc[i][1]);
        PickUp body = new PickUp();
        Engine engine = new Engine();
        Wheel wheel = new Street();
        Car temp2 = new Car(700);
        System.out.println(temp2.getPrice());
        System.out.println(temp2.getScore());
        //System.out.println(temp2.body.score());
        

    }
    private static String[][] cars= {
        {"BodyType","Engine" ,"Wheel"},
        {"BodyType","Engine" ,"street"},
        {"BodyType","Engine" ,"racing"},
        {"BodyType","twinTurbo" ,"Wheel"},
        {"BodyType","twinTurbo" ,"street"},
        {"BodyType","twinTurbo" ,"racing"},
        {"BodyType","ecoBoost" ,"Wheel"},
        {"BodyType","ecoBoost" ,"street"},
        {"BodyType","ecoBoost" ,"racing"},
        {"pickUp","Engine" ,"Wheel"},
        {"pickUp","Engine" ,"street"},
        {"pickUp","Engine" ,"racing"},
        {"pickUp","twinTurbo" ,"Wheel"},
        {"pickUp","twinTurbo" ,"street"},
        {"pickUp","twinTurbo" ,"racing"},
        {"pickUp","ecoBoost" ,"Wheel"},
        {"pickUp","ecoBoost" ,"street"},
        {"pickUp","ecoBoost" ,"racing"},
        {"superCar","Engine" ,"Wheel"},
        {"superCar","Engine" ,"street"},
        {"superCar","Engine" ,"racing"},
        {"superCar","twinTurbo" ,"Wheel"},
        {"superCar","twinTurbo" ,"street"},
        {"superCar","twinTurbo" ,"racing"},
        {"superCar","ecoBoost" ,"Wheel"},
        {"superCar","ecoBoost" ,"street"},
        {"superCar","ecoBoost" ,"racing"}
    };
    private static int[][] calculateIndexPriceScores(String[][] cars) {
        int[][] result = new int[27][3];
        BodyType body = new BodyType();
        Engine engine = new Engine();
        Wheel wheel = new Wheel();
        Car temp;
        for (int i = 0; i < cars.length; i++) {
            temp = createCar(cars[i][0], cars[i][1], cars[i][2]);
            result[i][0]=i;
            result[i][1]=temp.getPrice();
            result[i][2]=temp.getScore();
        }
        return result;
    }
    private static int[][] inPrSc = calculateIndexPriceScores(cars);

    private static Car createCar(String bodyIn, String engineIn, String wheelIn) {
        BodyType body = new BodyType();
        Engine engine = new Engine();
        Wheel wheel = new Wheel();
        switch (bodyIn) {
            case "pickUp":
                body = new PickUp();
                break;
            case "superCar":
                body = new SuperCar();
                break;
            default:
                body = new BodyType();
                break;
        }
        switch (engineIn) {
            case "ecoBoost":
                engine = new EcoBoost();
                break;
            case "twinTurbo":
                engine = new TwinTurbo();
                break;
            default:
                engine = new Engine();
                break;
        }
        switch (wheelIn) {
            case "street":
                wheel = new Street();
                break;
            case "racing":
                wheel = new Racing();
                break;
            default:
                wheel = new Wheel();
                break;
        }
        Car result = new Car (body, engine, wheel);
        return result;
}
    public Car(BodyType body, Engine engine, Wheel wheel) {
        this.body=body;
        this.engine=engine;
        this.wheel=wheel;
    }

    void setTax(int tax) {
    }

    Car(int budget) {
        Car temp ;
        if (budget < inPrSc[0][1])
            return;
        else
        {
            this.body= new BodyType();
            this.engine=new Engine();
            this.wheel=new Wheel();
        }
        for (int i=0 ; i < inPrSc.length ; i++)
        {
            if (budget >= inPrSc[i][1] && inPrSc[i][2] > this.getScore())
            {
                temp = createCar(cars[i][0],cars[i][1],cars[i][2]);
                this.body=temp.body;
                this.engine=temp.engine;
                this.wheel=temp.wheel;
            }
        }
        
    }

    public int getScore() {
        if (this.body == null)
            return 0;
        return body.score() + engine.score() + wheel.score() ;
    }

    public int getPrice() {
        if (this.body == null)
            return 0;
        return body.price() + engine.price() + wheel.price() ;

    }

}





