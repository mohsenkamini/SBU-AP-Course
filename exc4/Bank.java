interface BankAccount {
    boolean sendMoney(String amount, BankAccount bankAccount);

    BankCustomer getBankCustomer();

    void deposit(String amount);

    boolean withdraw(String amount);

    String getBalance();

    int getId();


}

interface BankCustomer {
    BankAccount[] getBankAccounts();

    String getWealth();

    String getName();

    String changeName(String newName);

    Boolean addBankAccount(BankAccount bankAccount);

    Boolean removeBankAccount(int bankAccountId);

    int getId();
}

interface Bank {
    public int getNumberOfBankAccounts();

    public int getNumberOfBankCustomers();

    public void setNumberOfBankAccounts(int newValue);

    public void setNumberOfBankCustomers(int newValue);

    public String getName();
}

class MyBankAccount implements BankAccount {
    public MyBankAccount(BankCustomer bankCustomer, Bank bank) {
        // todo
    }
    // todo
}


class MyBankCustomer implements BankCustomer {
    public MyBankCustomer(String name, Bank bank) {
        this.name=name;
        this.bank=bank;
        this.id=this.id+1
    }
    private String name;
    private Bank bank;
    private String wealth;
    private int ID;
    public void changeName(String name) {
        this.name=name;
    }
    public String getName() {
        return this.name;
    }

    public void setBank(Bank bank) {
        this.bank=bank;
    }
    public Bank getBank() {
        return this.bank;
    }

    public void setWealth(String wealth) {
        this.wealth=wealth;
    }
    public String getWealth() {
        return this.wealth;
    }

    public int getId() {
        return this.ID;
    }
}


class MyBank implements Bank {
    public MyBank(String name) {
        this.name=name;
    }
    private String name;
    private int numbetOfBankAccounts;
    private int numbetOfBankCustomers;

    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return this.name;
    }

    public void setNumbetOfBankAccounts(int numbetOfBankAccounts) {
        this.numbetOfBankAccounts=numbetOfBankAccounts;
    }
    public int getNumbetOfBankAccounts() {
        return this.numbetOfBankAccounts;
    }

    public void setNumbetOfBankCustomers(int numbetOfBankCustomers) {
        this.numbetOfBankCustomers=numbetOfBankCustomers;
    }
    public int getNumbetOfBankCustomers() {
        return this.numbetOfBankCustomers;
    }    
}