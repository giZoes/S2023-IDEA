package Bank;

import java.util.Scanner;

public class TestBanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposit = sc.nextDouble();//cun
        double withdraw = sc.nextDouble();//qu
        sc.close();
        Bank.addCustomer("san", "Zhang");
        Bank.addCustomer("si", "Li");
        Bank.getCustomer(0).addAccount(500);
        Bank.getCustomer(0).addAccount(1000);
        Bank.getCustomer(1).addAccount(2000);
        for (int i = 0; i < Bank.getNumberOfCustomers(); i++) {
            System.out.println(Bank.getCustomer(i).toString());
            for (int j = 0; j < Bank.getCustomer(i).getNumberOfAccounts(); j++) {
                System.out.println((j+1)+": 初始余额是->"+String.format("%.2f",Bank.getCustomer(i).getAccount(j).getBalance()));
                Bank.getCustomer(i).getAccount(j).deposit(deposit);
                Bank.getCustomer(i).getAccount(j).withdraw(withdraw);
                System.out.println("取款后的余额是->"+String.format("%.2f",Bank.getCustomer(i).getAccount(j).getBalance()));
            }
        }
    }
}