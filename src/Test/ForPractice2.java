package Test;

public class ForPractice2 {
    public static void main(String[] args) {
        /*****start*****/

        //在这里打印出正三角形
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("——————————我是华丽的分界线——————————");
        //在这里打印出倒三角形
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*****end*****/
    }
}
