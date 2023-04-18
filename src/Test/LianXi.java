package Test;

public class LianXi {


    public static void main(String[] args) {
        /*
         * 假设平台分配的四个整数为 1 2 3 4
         * 那么百位有可能是  1 2 3 4   十位：有可能是  1 2 3 4    个位：有可能是  1 2 3 4，
         * 要求是 百位 十位  各位上的数字不能重复
         * 比如：123  124  132  134 等都满足条件
         * 比如：122  131  121  232 等都不满足条件
         *
         * */

        //定义长度为4的int数组
        int[] array = new int[4];
        //创建Scanner对象获取平台输入的信息
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //获取平台给定的输入值并填充至数组中
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        //通过第一层循环控制百位的数字    array[i]表示百位的值
        for (int i = 0; i < array.length; i++) {
            //通过第二层循环控制十位的数字    array[j]表示十位的值
            for (int j = 0; j < array.length; j++) {
                //通过第三层循环控制个位的数字   array[k]表示个位的值
                for (int k = 0; k < array.length; k++) {

                    /**********begin**********/
                    if (array[i] != array[j] && array[j] != array[k] && array[k] != array[i] && array[i] != 0) {
                        System.out.println(array[i] * 100 + array[j] * 10 + array[k]);
                    }

                    /**********end**********/
                }
            }
        }
    }

}