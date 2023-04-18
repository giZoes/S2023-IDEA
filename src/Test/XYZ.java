package Test;

public class XYZ {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //获取平台分配的x的值
        int x = sc.nextInt();
        //获取平台分配的y的值
        int y = sc.nextInt();
        ;
        //获取平台分配的z的值
        int z = sc.nextInt();
        ;

        /**********begin**********/
        int t = 0;
        if (x > y) {
            t = x;
            x = y;
            y = t;
        }
        if (x > z) {
            t = x;
            x = z;
            z = t;
        }
        if (y > z) {
            t = y;
            y = z;
            z = t;
        }
        /**********end**********/
        System.out.print("x:" + x + " y:" + y + " z:" + z);
    }
}
