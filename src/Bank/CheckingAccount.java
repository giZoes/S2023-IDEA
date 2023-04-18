package Bank;

public class CheckingAccount extends Account{
    private double overdraftAmount;
    public CheckingAccount(double bal,double odA){
        super(bal);
        overdraftAmount=odA;
    }
    public double getOverdraftAmount(){
        return overdraftAmount;
    }
    public boolean withdraw(double amount){
        double overdraftNeeded=0;
        if (balance<amount){
            overdraftNeeded=amount-balance;
        }
        if (overdraftNeeded>overdraftAmount){
            System.out.println("Transaction Fails!");
        }else {
            balance=0;
            overdraftAmount-=overdraftNeeded;
        }
        return false;
    }
}
