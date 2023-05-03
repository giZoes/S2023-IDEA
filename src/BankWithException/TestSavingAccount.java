package BankWithException;

import java.util.Scanner;

public class TestSavingAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double interestRate = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(balance, interestRate);
        sa.accumulateInterest();
        System.out.println(sa.getBalance());
    }
}
