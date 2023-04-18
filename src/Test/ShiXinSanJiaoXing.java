package Test;

public class ShiXinSanJiaoXing {
    public static void main(String[] args) {
        //创建Scanner对象用于获取平台给定的输入信息
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //定义需要打印的总行数
        int lineNum = sc.nextInt();

		/*
		 i（行号）      空格数量（lineNum－i）　   星星数量 （２＊i　－１）
			1                    5                      1
			2                    4                      3
			3                    3                      5
			4                    2                      7
			5                    1                      9
			6                    0                      11


		*/

        //通过外循环控制需要打印的行数
        for (int i = 1; i <= lineNum; i++) {

            /**********begin**********/

            //通过内循环（1）控制需要打印的空格
            for (int j = 0; j < lineNum - i; j++) {
                System.out.print(" ");
            }


            //通过内循环（2）控制需要打印的星星的数量
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }


            /**********end**********/

            //当前行中的空格以及星星打印完成之后进行换行操作 \n表示换行
            System.out.print("\n");

        }
    }
}
