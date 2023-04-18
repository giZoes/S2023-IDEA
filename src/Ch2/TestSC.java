package Ch2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        while (sc.hasNext()) {
            try {
                // 正常流程
                i = sc(sc);
                System.out.println(i);
            } catch (InputMismatchException e) {
                // 出错流程
                e.getStackTrace();
                sc.next();
            }
        }
        System.out.println(i);
    }
    public static int sc(Scanner a){
        return a.nextInt();
    }
}
