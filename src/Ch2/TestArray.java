package Ch2;

public class TestArray {

    // 四个要素：name, parameters, return type, body
    public static char[] createCharArray() {
        char[] s = new char[26];
        for (int i = 0; i < 26; i++) {
            s[i] = (char) ('A' + i);
        }
        return s;
    }

    public static Point[] createPointArray() {
        Point[] p = new Point[10];
        for (int i = 0; i < 10; i++) {
            p[i] = new Point(i, i + 1);
        }
        return p;
    }

    public static void main(String[] args) {
        int[] arr1;  // 声明数组
        arr1 = new int[5];  // 分配空间

        int[] arr2 = new int[5];
        // 数组下标从0~长度-1
        System.out.println(arr2.length);
        System.out.println(arr2[5]);

        String str = "HELLOHELLO";
        System.out.println(str.length());

        int[] arr3 = {34, 56, 6, 945, 55859};  // 初始化

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        //增强的for循环
        for (int element : arr3) {
            System.out.println(element);
        }

        char[] s = createCharArray();
        Point[] p = createPointArray();

        // 多维数组：数组的数组
        int[][] arr4 = new int[3][];
        arr4[0] = new int[5];
        arr4[1] = new int[8];
        arr4[2] = new int[2];

        int[][] arr5 = new int[3][5];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                // arr4[i][j];
            }
        }


    }

}
