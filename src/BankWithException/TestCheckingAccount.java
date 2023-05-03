package BankWithException;

import java.util.Scanner;

public class TestCheckingAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double overdraftAmount = sc.nextDouble();

        CheckingAccount ca = new CheckingAccount(balance, overdraftAmount);
        try {
            ca.withdraw(6000);
        } catch (OverdraftException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ca.getBalance());
        System.out.println(ca.getOverdraftAmount());
        sc.close();
    }
}

