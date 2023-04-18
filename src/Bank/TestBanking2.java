package Bank;

import java.util.Scanner;

public class TestBanking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double withdraw = sc.nextDouble();//qu
        sc.close();
        Account one=new SavingsAccount(5000,0.017);
        Account two=new CheckingAccount(3000,2000);
        Account three=new CheckingAccount(2000,5000);
        Bank.addCustomer("san", "Zhang");
        Bank.addCustomer("si", "Li");
        Bank.getCustomer(0).addAccount(one);
        Bank.getCustomer(0).addAccount(two);
        Bank.getCustomer(1).addAccount(three);
        for (int i = 0; i < Bank.getNumberOfCustomers(); i++) {
            System.out.println(Bank.getCustomer(i).toString());
            for (int j = 0; j < Bank.getCustomer(i).getNumberOfAccounts(); j++) {
                System.out.println((j+1)+": 初始余额是->"+String.format("%.2f",Bank.getCustomer(i).getAccount(j).getBalance()));
                if (Bank.getCustomer(i).getAccount(j) instanceof CheckingAccount){
                    Bank.getCustomer(i).getAccount(j).withdraw(withdraw);
                    System.out.println("存取款后的余额是->"+String.format("%.2f",Bank.getCustomer(i).getAccount(j).getBalance()));
                    System.out.println("下一次允许透支的额度是->"+String.format("%.2f",((CheckingAccount) Bank.getCustomer(i).getAccount(j)).getOverdraftAmount()));
                } else if (Bank.getCustomer(i).getAccount(j) instanceof SavingsAccount) {
                    ((SavingsAccount) Bank.getCustomer(i).getAccount(j)).accumulateInterest();
                    System.out.println("计算利息后的余额是->"+String.format("%.2f",Bank.getCustomer(i).getAccount(j).getBalance()));
                }
            }
        }
    }
}