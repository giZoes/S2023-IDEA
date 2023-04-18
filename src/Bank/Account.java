package Bank;

public class Account {
    double balance;
    public Account(){
        this(1000);
    }
    public Account(double num){
        balance=num;
    }
    public double getBalance(){
        return balance;
    }
    public boolean deposit(double num){//返回布尔值
        balance+=num;
        return true;
    }
    public boolean withdraw(double num){//取钱
        if (num>=balance){
            System.out.println("This account balance is insufficient!!");
            return false;
        }else {
            balance-=num;
            return true;
        }
    }
}
