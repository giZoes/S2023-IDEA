package Bank;

public class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(double bal,double intRate){
        super(bal);
        this.interestRate=intRate;
    }
    public void accumulateInterest(){
        balance=balance+balance*interestRate;
    }
}
