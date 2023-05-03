package BankWithException;

public class CheckingAccount extends Account {
    private double overdraftAmount;// 代表允许透支的额度

    public CheckingAccount(double initBalance, double overdraftAmount) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0.0);
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    @Override
    // 修改withdraw()方法
    /********** Begin *********/
    public void withdraw(double amount) throws OverdraftException {
        double overdraftNeeded=0;
        if (balance<amount){
            overdraftNeeded=amount-balance;
        }
        if (overdraftNeeded>overdraftAmount){
            throw new OverdraftException("Transaction Fails!",overdraftNeeded-overdraftAmount);
        }else {
            balance=0;
            overdraftAmount-=overdraftNeeded;
        }
    }
    /********** End *********/

}
