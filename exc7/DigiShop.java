import java.util.*;


public class DigiShop {
    public static void main (String[] args) {
        try {
            DigiShop ds = new DigiShop();

            Account.createAccount("mohsen", "mmm", "1600");
            Account.createAccount("mohsen1", "mmm1", "1600");
            Account.createAccount("mohsen2", "mmm2", "1600");
            Account.createAccount("mohsen3", "mmm3", "1600");
            Account.createAccount("mohsen4", "mmm4", "1600");
            Product.createProduct("productName", "productPrice", "100");

            //System.out.println (ds.getBalance());
            ds.login("mohsen2", "mmm2");
            System.out.println(ds.isLoggedIn);
            System.out.println (ds.getBalance());
            ds.buyProduct("productName", 100);
            System.out.println (ds.getBalance());
        } catch (Exception a ) {System.out.println(a);}
        
    }

    private String accountUsername = "";
    private boolean isLoggedIn= false;
    public void login(String accountUsername, String accountPassword) throws WrongCredentialsException {
        if ((Account.username.indexOf(accountUsername) == Account.pass.indexOf(accountPassword)) )
            if (Account.username.indexOf(accountUsername) != -1)
            {    
                this.accountUsername=accountUsername;
                isLoggedIn=true;
            }
            else
                throw new WrongCredentialsException("");
        else
            throw new WrongCredentialsException("");

    }

    public synchronized void buyProduct(String productName, int count) throws ProductDoesNotExists, InventoryNotEnoughException, InventoryEmptyException, InsufficientBalanceException, NotLoginException  {
        try {
            if (!Product.name.contains(productName))
                throw new ProductDoesNotExists("");
            if ( Integer.parseInt(Product.inventory.get(Product.name.indexOf(productName))) < 1 )
                throw new InventoryEmptyException("");
            if ( Integer.parseInt(Product.inventory.get(Product.name.indexOf(productName))) < count )
                throw new InventoryNotEnoughException("");
            if ( Integer.parseInt(Product.inventory.get(Product.name.indexOf(productName))) > Integer.parseInt(Account.balance.get(Account.username.indexOf(accountUsername))) )
                throw new InsufficientBalanceException("");
        } catch (IndexOutOfBoundsException a) {};
        if (this.isLoggedIn == false)
            throw new NotLoginException("");
        
        Account.balance.set(Account.username.indexOf(accountUsername), Integer.toString(Integer.parseInt(Account.balance.get(Account.username.indexOf(accountUsername))) - count) );
        
        Product.inventory.set(Product.name.indexOf(productName), Integer.toString(Integer.parseInt(Product.inventory.get(Product.name.indexOf(productName))) - count));
        


        }

    public synchronized String getBalance() throws NotLoginException {
        if (this.isLoggedIn == false)
            throw new NotLoginException("");
        return Account.balance.get(Account.username.indexOf(accountUsername));
    }
}


class Account {
    static ArrayList <String> username= new ArrayList<String>();
    static ArrayList <String> pass= new ArrayList<String>();
    static ArrayList <String> balance= new ArrayList<String>();

    public static void createAccount(String accountUsername, String accountPass, String accountInitialBalance) {
        username.add(accountUsername);
        pass.add(accountPass);
        balance.add(accountInitialBalance);
    }

    public static  int getNumberOfAccounts() {
        return username.size();
    }
}

class Product {

    static ArrayList <String>  name = new ArrayList<String>();
    static ArrayList <String>  price = new ArrayList<String>();
    static ArrayList <String>  inventory = new ArrayList<String>();

    public static int getNumberOfProducts() {
        return name.size();
    }

    public static void createProduct(String productName, String productPrice, String productInventory) {
        name.add(productName);
        price.add(productPrice);
        inventory.add(productInventory);
    }

}

class WrongCredentialsException extends Exception {
    WrongCredentialsException(String s) {
        super(s);
    }
}

class ProductDoesNotExists extends Exception {
    ProductDoesNotExists(String s) {
        super(s);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String s) {
        super(s);
    }
}

class InventoryEmptyException extends Exception {
    InventoryEmptyException(String s) {
        super(s);
    }
}

class InventoryNotEnoughException extends Exception {
    InventoryNotEnoughException(String s) {
        super(s);
    }
}

class NotLoginException extends  Exception{
    NotLoginException(String s) {
        super(s);
    }
}