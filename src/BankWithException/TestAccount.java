package BankWithException;


public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(1000);        System.out.println(acc1.getBalance());
        Account acc2 = new Account(500);
        try {
            acc2.withdraw(1000);
        } catch (OverdraftException e) {
            throw new RuntimeException(e);
        }
        System.out.println(acc2.getBalance());
            }
}

