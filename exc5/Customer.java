public class Customer {

    public static void main(String[] args) {  
        Cookies cookies = new Creamy_Pastry();
        cookies.addCustomerBasket(3);
        cookies.removeCustomerBasket(1);
        cookies.addCustomerBasket(9);
        System.out.println("Balance: "+Creamy_Pastry.CreamyBalance);
        System.out.println(cookies.getCustomerBasket());
        System.out.println(cookies.toString());
        System.out.println(cookies.getBalance());
        System.out.println(cookies.setBakingPowder(60));
        cookies.removeCustomerBasket(10);
        System.out.println("Balance: "+Creamy_Pastry.CreamyBalance);
        System.out.println(cookies.getCustomerBasket());
        System.out.println(cookies.getBalance());

        Cookies c1 = new Danish_Pastry();
        // for (int i=0 ; i < 400 ; i++)
        // {
            // System.out.println( i + " Butter: " +c1.setButter (i));
            // System.out.println( i + " suger: " +c1.setSuger (i));
            // System.out.println( i + " baking powder: " +c1.setBakingPowder(i));
            // System.out.println( i + " egg: " +c1.setEgg (i));
            // System.out.println( i + " vanilla: " +c1.setVanilla (i));
            // System.out.println( i + " flour: " +c1.setFlour (i));
            // System.out.println( i + " water: " +c1.setWater (i));
            // System.out.println( i + " deg: " +c1.setCookingDegree (i));
            // System.out.println( i + " time: " +c1.setCookingTime (i));
            // System.out.println( i + " syrup: " +c1.setCandySyrup (i));
        // }
    }
}

abstract class Cookies{
    protected int Egg;
    protected int Vanilla;
    protected int BakingPowder;
    protected int Butter;
    protected int Flour;
    protected int Suger;
    protected int Water;
    protected int Degree;
    protected int CandySyrup;
    protected int Time;
    protected int CustomerBasket;
    abstract String setEgg(int amount) ;
    abstract String setVanilla(int amount);
    abstract String setBakingPowder(int amount);
    abstract String setButter(int amount);
    abstract String setFlour(int amount);
    abstract String setSuger(int amount);
    abstract String setWater(int amount);
    abstract String setCookingDegree(int amount);
    abstract String setCookingTime(int amount);
    abstract String setCandySyrup(int amount);
    abstract int getCustomerBasket();
    abstract void addCustomerBasket(int amount);
    abstract int getBalance();
    abstract void removeCustomerBasket(int amount);//remove Cookies balance in each class 
}

class Creamy_Pastry extends Cookies {
    static int CreamyBalance;//120000 for 1 killo
    String setEgg(int amount) {
        int min=4,max=6;
        if (min <= amount && amount <= max )
        {
            this.Egg=amount;
            return "ok";
        }
        else
            return "nemishe";
    }
    String setVanilla(int amount) {

        int min=15,max=100;
        if (min <= amount && amount <= max )
        {
            this.Vanilla=amount;
            return "ok";
        }
        else
            return "nemishe";
    }
    String setBakingPowder(int amount) {
        int min=40,max=65;
        if (min <= amount && amount <= max )
        {
            this.BakingPowder=amount;
            return "ok";
        }
        else
            return "nemishe";
    }
    String setButter(int amount) {
        int min=30,max=100;
        if (min <= amount && amount <= max )
        {
            this.Butter=amount;
            return "ok";
        }
        else
            return "nemishe";
    }
    String setFlour(int amount) {
        int min=200,max=350;
        if (min <= amount && amount <= max )
        {
            this.Flour=amount;
            return "ok";
        }
        else
            return "nemishe";
    }
    String setSuger(int amount) {
        int min=100,max=350;
        if (min <= amount && amount <= max )
        {
            this.Suger=amount;
            return "ok";
        }
        else
            return "nemishe";
    }
    String setWater(int amount) {
        int min=170,max=350;
        if (min <= amount && amount <= max )
        {
            this.Water=amount;
            return "ok";
        }
        else
            return "nemishe";}
    String setCookingDegree(int amount) {
        int min=140,max=260;
        if (min <= amount && amount <= max )
        {
            this.Degree=amount;
            return "ok";
        }
        else
            return "nemishe";}
    String setCookingTime(int amount) {
        int min=20,max=35;
        if (min <= amount && amount <= max )
        {
            this.Time=amount;
            return "ok";
        }
        else
            return "nemishe";
    }


    int getCustomerBasket() {
        return this.CustomerBasket;
    }
    void addCustomerBasket(int amount) {
        this.CustomerBasket+=amount;
        this.CreamyBalance+=(120000*amount);
    }
    int getBalance() {
        return this.CreamyBalance;
    }
    void removeCustomerBasket(int amount) //remove Cookies balance in each class  
    {
        this.CustomerBasket-=amount;
        this.CreamyBalance-=(120000*amount);
    }
    String setCandySyrup(int amount) {
        int min=9,max=15;
        return null;
    }
    public String toString() {
        String s = "" ;
        s += this.CustomerBasket;
        s+=" killo Creamy Pastry";
        return s;
    }
        // if (min <= amount && amount <= max )
        // {
        //     this.CandySyrup=amount;
        //     return "ok";
        // }
        // else
        //     return "nemishe";
    Creamy_Pastry() {
        setEgg(4);
        setButter(50);
        setWater(200);
        setSuger(150);
        setVanilla(25);
        setBakingPowder(50);
        setFlour(200);
        setCookingDegree(200);
        setCookingTime(30);
        // setCandySyrup(0);
    }

}

class Danish_Pastry extends Creamy_Pastry{
    static int DanishBalance;//125000 for 1 killo
    
    void addCustomerBasket(int amount) {
        this.CustomerBasket+=amount;
        this.CreamyBalance+=(125000*amount);
    }
    int getBalance() {
        return this.CreamyBalance;
    }
    void removeCustomerBasket(int amount) //remove Cookies balance in each class  
    {
        this.CustomerBasket-=amount;
        this.CreamyBalance-=(125000*amount);
    }
    String setCandySyrup(int amount) {
        int min=9,max=15;
        if (min <= amount && amount <= max )
        {
            this.CandySyrup=amount;
            return "ok";
        }
        else
            return "nemishe";
    }
    public String toString () {
        String s = "" ;
        s += this.CustomerBasket;
        s+= " killo Danish Pastry";
        return s;
    }

    Danish_Pastry() {
        setEgg(5);
        setButter(40);
        setWater(300);
        setSuger(200);
        setVanilla(30);
        setBakingPowder(60);
        setFlour(250);
        setCookingDegree(150);
        setCookingTime(25);
        setCandySyrup(10);
    }

}

class Napoleon_Pastry extends Creamy_Pastry {
    static int NapoleonBalance;//130000 for 1 killo

    
    void addCustomerBasket(int amount) {
        this.CustomerBasket+=amount;
        this.CreamyBalance+=(130000*amount);
    }
    int getBalance() {
        return this.CreamyBalance;
    }
    void removeCustomerBasket(int amount) //remove Cookies balance in each class  
    {
        this.CustomerBasket-=amount;
        this.CreamyBalance-=(130000*amount);
    }
    public String toString () {
        String s = "" ;
        s += this.CustomerBasket;
        s+= " killo Napoleon Pastry";
        return s;
    }
    Napoleon_Pastry() {
        setEgg(4);
        setButter(50);
        setWater(400);
        setSuger(300);
        setVanilla(70);
        setBakingPowder(50);
        setFlour(300);
        setCookingDegree(250);
        setCookingTime(30);
        // setCandySyrup(0);
    }

}