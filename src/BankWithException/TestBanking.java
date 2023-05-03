package BankWithException;

import java.util.Scanner;

public class TestBanking {

    public static void main(String[] args) {
        // 数据的输入
        Scanner sc = new Scanner(System.in);
        double wamount = sc.nextDouble();

        // 数据的初始化：客户+账户
        Bank.addCustomer("Zhang", "san");
        Customer cus1 = Bank.getCustomer(0);
        cus1.addAccount(new SavingsAccount(5000, 0.017));
        cus1.addAccount(new CheckingAccount(3000, 2000));

        Bank.addCustomer("Li", "si");
        Customer cus2 = Bank.getCustomer(1);
        cus2.addAccount(new CheckingAccount(2000, 5000));

        for (int i = 0; i < Bank.getNumberOfCustomers(); i++) {
            Customer cus = Bank.getCustomer(i);
            System.out.println(cus);
            for (int j = 0; j < cus.getNumberOfAccounts(); j++) {
                Account acc = cus.getAccount(j);

                // 请使用try-catch捕获OverdraftException
                /********** Begin *********/
                System.out.println((j+1)+": 初始余额是->"+String.format("%.2f", acc.getBalance()));
                if (acc instanceof CheckingAccount){
                    System.out.println("允许透支的额度是->"+String.format("%.2f", ((CheckingAccount) acc).getOverdraftAmount()));
                    try {
                        acc.withdraw(wamount);
                        System.out.println("取款后的余额是->"+String.format("%.2f", acc.getBalance()));
                        System.out.println("下一次允许透支的额度是->"+String.format("%.2f",(((CheckingAccount) acc).getOverdraftAmount())));
                    } catch (OverdraftException e) {
                        System.out.println(e.getMessage());
                        System.out.printf("赤字是->%.2f\n",e.getDeficit());
                    }
                } else if (acc instanceof SavingsAccount) {
                    ((SavingsAccount) acc).accumulateInterest();
                    System.out.println("计算利息后的余额是->"+String.format("%.2f", acc.getBalance()));
                }
                /********** End *********/
            }
        }
        sc.close();
    }
}