package Test;

public class Findzhishu {
    public static void main(String[] args) {
        /*
		     打印输出质数的时候务必按照如下格式：System.out.print(质数+" ")；
		     使用print进行打印同时被打印输出的质数后加上一个空格，
		     以便于与平台提供的结果格式保持一致！
            */
        for (int i = 2; i < 1001; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) break;
                else if (i % j == 0 && i == j) System.out.print(i + " ");
            }
        }
    }
}
