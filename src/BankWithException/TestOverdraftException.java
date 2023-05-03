package BankWithException;

public class TestOverdraftException {
    public static void main(String[] args) {
        OverdraftException oe = new OverdraftException("账户余额不足！", 2000);
        System.out.println(oe.getMessage());
        System.out.println(oe.getDeficit());
    }
}
