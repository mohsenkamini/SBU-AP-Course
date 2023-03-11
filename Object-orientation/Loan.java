import java.util.date;
public class Loan {
    private double annualInterestRate;
    private Date loanDate;
    private int numberOfYears;
    private double loanAmount;
    Loan(double annualInterestRate,Date loanDate,int numberOfYears) {
        this.annualInterestRate=annualInterestRate;
        this.numberOfYears=numberOfYears;
        this.loanAmount=loanAmount;
        Date D = new Date();
        this.loanDate=D.toString();
    }
    
    Loan () {
        this(2.5,1,1000);
    }

    
}