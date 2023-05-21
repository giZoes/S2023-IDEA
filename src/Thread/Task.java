package Thread;

public class Task {

    public static void main(String[] args) {

        final InsertData insert = new InsertData();

        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                public void run() {
                    insert.insert(Thread.currentThread());
                }
            }).start();
        }

    }
}

class InsertData {

    public static int num =0;

    /********* Begin *********/
    public synchronized void insert(Thread thread) {

        for (int i = 0; i <= 5; i++) {
            num++;
            System.out.println(num);
        }
    }

    /********* End *********/
}
