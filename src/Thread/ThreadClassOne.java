package Thread;

public class ThreadClassOne extends Thread {
    public void run() {
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
