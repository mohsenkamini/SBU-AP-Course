import java.util.ArrayList;
import java.util.Arrays;
public class Car {
    public String Name;
    public String Model;
    public String Color;
    public int ConstructionYear;
    public String numberPlate;
    public String RentalPrice;
    //public static Car[] forRent = new Car[0] ;
    public static ArrayList<Car> forRent = new ArrayList<Car>(); ;
    private static int listLimit=20;

    public static void main (String[] args) {
        String[] info = {"mose","lambo","black","007","10000"};
        //System.out.println(info);
        for (int i=0 ; i < 10 ; i++)
        {
            Car mosen = new Car (2000+i,info);
            info[0]+="n";
            //System.out.println(addForRent(mosen));
            //System.out.println(addForRent(mosen));
        }
    }
    Car(int ConstructionYear, String...information) {
        this.ConstructionYear=ConstructionYear;
        this.Name=information[0];
        this.Model=information[1];
        this.Color=information[2];
        this.numberPlate=information[3];
        this.RentalPrice=information[4];
    }
    public static boolean searchByName(String name) {
        boolean result=false;/* 
        for (int i=0 ; i < forRent.length ; i++)
            if (forRent[i].Name.equals(name)) */
        for (int i=0 ; i < forRent.size() ; i++)
            if (forRent.get(i).Name.equals(name))
                result=true;
        return result;
    }
    public static boolean searchByModel(String model) {
        boolean result=false;/* 
        for (int i=0 ; i < forRent.length ; i++)
            if (forRent[i].Model.equals(model)) */
                
        for (int i=0 ; i < forRent.size() ; i++)
            if (forRent.get(i).Model.equals(model))
                result=true;
        return result;
    }
    public static boolean searchByColor(String color) {
        boolean result=false;/* 
        for (int i=0 ; i < forRent.length ; i++)
            if (forRent[i].Color.equals(color)) */
        for (int i=0 ; i < forRent.size() ; i++)
            if (forRent.get(i).Color.equals(color))
                result=true;
        return result;
    }
    public static boolean searchByYear(int year) {
        boolean result=false;/* 
        for (int i=0 ; i < forRent.length ; i++)
            if (forRent[i].ConstructionYear.equals(year)) */
        for (int i=0 ; i < forRent.size() ; i++)
            if (forRent.get(i).ConstructionYear==year)
                result=true;
        return result;
    }
    public static boolean searchByPlate(String plate) {
        boolean result=false;/* 
        for (int i=0 ; i < forRent.length ; i++)
            if (forRent[i].numberPlate.equals(plate)) */
        for (int i=0 ; i < forRent.size() ; i++)
            if (forRent.get(i).numberPlate.equals(plate))
                result=true;
        return result;
    }
    public static boolean searchByPrice(String Price) {
        boolean result=false;/* 
        for (int i=0 ; i < forRent.length ; i++)
            if (forRent[i].RentalPrice.equals(price)) */
        for (int i=0 ; i < forRent.size() ; i++)
            if (forRent.get(i).RentalPrice.equals(Price))
                result=true;
        return result;
    }
    public static boolean addForRent(Car c) {
        if (searchByName(c.Name) && searchByModel(c.Model) && searchByColor(c.Color) && searchByYear(c.ConstructionYear) && searchByPlate(c.numberPlate) && searchByPrice(c.RentalPrice))
            return true;
        else {
            if (forRent.size() +1 <= listLimit) {
                //Car[] newCars = new Car[forRent.length+1];
                //System.arraycopy(forRent,0,newCars,0,forRent.length);
                //newCars[newCars.length-1]=c;
                //forRent=newCars;
                forRent.add(c);
            }
            return false;
        }
    }
    public static boolean changeList(int n) {
        int max = 20,min=3;
        if (n >= min && n <= max)
        {
            listLimit=n;
            return true;
        }
        else
            return false;
    }

    public void setName(String Name) {
        this.Name=Name;
    }
    public String getName() {
        return this.Name;
    }
    public void setModel(String Model) {
        this.Model=Model;
    }
    public String getModel() {
        return this.Model;
    }
    public void setColor(String Color) {
        this.Color=Color;
    }
    public String getColor() {
        return this.Color;
    }
    public void setConstructionYear(int ConstructionYear) {
        this.ConstructionYear=ConstructionYear;
    }
    public int getConstructionYear() {
        return this.ConstructionYear;
    }
    public void setNumberPlate(String numberPlate) {
        this.numberPlate=numberPlate;
    }
    public String getNumberPlate() {
        return this.numberPlate;
    }
    public void setRentalPrice(String RentalPrice) {
        this.RentalPrice=RentalPrice;
    }
    public String getRentalPrice() {
        return this.RentalPrice;
    }
    
}

class Customer {
    public int Cash ;
    public String FullName;
    public String ID;
    public Car[] CustomerCars = new Car[0];
    private int listLimit=20;
    //public ArrayList<Car> CustomerCars = new ArrayList<Car>(); ;
    
    Customer(int Cash , String FullName) {
        this.Cash=Cash;
        this.FullName=FullName;
    }
    public void ChangeCash(int cash) {
        if (cash < 0)
            if (this.Cash >= -cash)
                this.Cash+=cash;
        else
            this.Cash+=cash;
    }
    public boolean ChangeList(Car c) {
        if (searchByName(c.Name) && searchByModel(c.Model) && searchByColor(c.Color) && searchByYear(c.ConstructionYear) && searchByPlate(c.numberPlate) && searchByPrice(c.RentalPrice))
            return false;
        else if (this.CustomerCars.length+1 <= listLimit)
        {
            Car[] newCars = new Car[this.CustomerCars.length+1];
            System.arraycopy(this.CustomerCars,0,newCars,0,this.CustomerCars.length);
            newCars[newCars.length-1]=c;
            this.setCustomerCars(newCars);
            return true;
        }
        return false;
    }
    public static boolean checkIdInt (String s) {
        Pattern p = Pattern.compile("[+-]{0,1}[0-9]{2}.*[02468]$");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    public static boolean checkIdFloat (String s) {
        Pattern p = Pattern.compile("[+-]{0,1}[0-9]{2}\\.[0-9]{2,6}.*[02468]$");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    }
    //public String setID(String ID) {
//
    //}
    //public String toString()
    
    public void setCash(int Cash) {
        this.Cash=Cash;
    }
    public int getCash() {
        return this.Cash;
    }
    public void setFullName(String FullName) {
        this.FullName=FullName;
    }
    public String getFullName() {
        return this.FullName;
    }
    public void setID(String ID) {
        this.ID=ID;
    }
    public String getID() {
        return this.ID;
    }
    public void setCustomerCars(Car[] CustomerCars) {
        //this.CustomerCars=Arrays.asList(CustomerCars);
        this.CustomerCars=CustomerCars;
    }
    public Car[] getCustomerCars() {
        return this.CustomerCars;
    }


    public boolean searchByName(String name) {
        boolean result=false;
        for (int i=0 ; i < this.CustomerCars.length ; i++)
            if (this.CustomerCars[i].Name.equals(name)) 
        // for (int i=0 ; i < forRent.size() ; i++)
            // if (forRent.get(i).Name.equals(name))
                result=true;
        return result;
    }
    public boolean searchByModel(String model) {
        boolean result=false;
        for (int i=0 ; i < this.CustomerCars.length ; i++)
            if (this.CustomerCars[i].Model.equals(model)) 
                
        // for (int i=0 ; i < forRent.size() ; i++)
            // if (forRent.get(i).Model.equals(model))
                result=true;
        return result;
    }
    public boolean searchByColor(String color) {
        boolean result=false;
        for (int i=0 ; i < this.CustomerCars.length ; i++)
            if (this.CustomerCars[i].Color.equals(color)) 
        // for (int i=0 ; i < forRent.size() ; i++)
            // if (forRent.get(i).Color.equals(color))
                result=true;
        return result;
    }
    public boolean searchByYear(int year) {
        boolean result=false;
        for (int i=0 ; i < this.CustomerCars.length ; i++)
            if (this.CustomerCars[i].ConstructionYear == (year)) 
        // for (int i=0 ; i < forRent.size() ; i++)
            // if (forRent.get(i).ConstructionYear==year)
                result=true;
        return result;
    }
    public boolean searchByPlate(String plate) {
        boolean result=false;
        for (int i=0 ; i < this.CustomerCars.length ; i++)
            if (this.CustomerCars[i].numberPlate.equals(plate)) 
        // for (int i=0 ; i < forRent.size() ; i++)
        //     if (forRent.get(i).numberPlate.equals(plate))
                result=true;
        return result;
    }
    public boolean searchByPrice(String Price) {
        boolean result=false;
        for (int i=0 ; i < this.CustomerCars.length ; i++)
            if (this.CustomerCars[i].RentalPrice.equals(Price)) 
        // for (int i=0 ; i < forRent.size() ; i++)
        //     if (forRent.get(i).RentalPrice.equals(Price))
                result=true;
        return result;
    }
}