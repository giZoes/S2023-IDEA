package BankWithException;

public class OverdraftException extends Exception{
    private double deficit;//赤字
    public OverdraftException(String s, double i) {
        super(s);
        deficit=i;
    }

    public double getDeficit() {
        return deficit;
    }
}
