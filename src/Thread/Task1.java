package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task1 {

    public static void main(String[] args) {
        final Insert insert = new Insert();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                insert.insert(Thread.currentThread());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                insert.insert(Thread.currentThread());
            }
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                insert.insert(Thread.currentThread());
            }
        });
        // 设置线程优先级
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}

class Insert {

    public static int num;

    // 在这里定义Lock
    private Lock lock=new ReentrantLock();
    public void insert(Thread thread) {
        /********* Begin *********/
        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            for(int i=0;i<5;i++) {
                num++;
                System.out.println(num);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }


        /********* End *********/
    }

}
