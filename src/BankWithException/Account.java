package BankWithException;

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {
        this(1000);
    }

    // 存钱
    public void deposit(double amount) {
        balance += amount;
    }

    // 修改withdraw()方法
    /********** Begin *********/
    public void withdraw(double num) throws OverdraftException{
        if (num>=balance){
            throw new OverdraftException("This account balance is insufficient!!",num-balance);
        }else {
            balance-=num;
        }
    }
    /********** End *********/

    public double getBalance() {
        return balance;
    }
}