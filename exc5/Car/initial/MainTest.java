public class MainTest {
    public static void main(String[] args) {
        //getting the engine, wheel and body from user of two cars and compare them
        String[][] cars = new String[3][2];
//       Enter the body, engine and wheel of car 1 in a line separated by -
        String firstAnswer = "pickUp-ecoBoost-street";
        cars[0] = firstAnswer.split("-");
//        Enter the body, engine and wheel of car 2 in a line separated by -
        String secondAnswer = "BodyType-twinTurbo-racing";
        cars[1] = secondAnswer.split("-");
        //as the car constructor takes a class of body, engine and wheel, we need to create an object of them
        BodyType[] body = new BodyType[2];
        Engine[] engine = new Engine[2];
        Wheel[] wheel = new Wheel[2];
        //creating the objects of body, engine and wheel
        for (int i = 0; i < 2; i++) {
            switch (cars[i][0]) {
                case "pickUp":
                    body[i] = new PickUp();
                    break;
                case "superCar":
                    body[i] = new SuperCar();
                    break;
                default:
                    body[i] = new BodyType();
                    break;
            }
            switch (cars[i][1]) {
                case "ecoBoost":
                    engine[i] = new EcoBoost();
                    break;
                case "twinTurbo":
                    engine[i] = new TwinTurbo();
                    break;
                default:
                    engine[i] = new Engine();
                    break;
            }
            switch (cars[i][2]) {
                case "street":
                    wheel[i] = new Street();
                    break;
                case "racing":
                    wheel[i] = new Racing();
                    break;
                default:
                    wheel[i] = new Wheel();
                    break;
            }
        }
        //creating the objects of car
        Car car1 = new Car(body[0], engine[0], wheel[0]);
        Car car2 = new Car(body[1], engine[1], wheel[1]);
        //comparing the cars
        System.out.println("Car 1 score: " + car1.getScore());
        System.out.println("Car 2 score: " + car2.getScore());
        System.out.println("Car 1 price: " + car1.getPrice());
        System.out.println("Car 2 price: " + car2.getPrice());
        System.out.println();

//        Enter the budget
        int budget = 3000;
        Car car = new Car(budget);
        if (car.body == null) {
            System.out.println("There is no car in the budget");
        } else {
            System.out.println("The best car in the budget is:");
            System.out.println("Body: " + car.body.getClass().getSimpleName());
            System.out.println("Engine: " + car.engine.getClass().getSimpleName());
            System.out.println("Wheel: " + car.wheel.getClass().getSimpleName());
            System.out.println("Score: " + car.getScore());
            System.out.println("Price: " + car.getPrice());
        }

    }
}
