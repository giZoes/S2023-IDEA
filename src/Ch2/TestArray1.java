package Ch2;

import java.util.Arrays;

public class TestArray1 {

    public static void main(String[] args) {
        // 求第二大元素的下标
        // 没考虑数组元素有重复的情况，最大元素有两个以上
        int[] arr = {3, 14, 5, 7, 9, 24, 67, 78, 21, 16};

        int[] arr1 = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arr1);
        System.out.println(Arrays.binarySearch(arr, 9));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr1[arr1.length - 2]) {
                System.out.println(i);
            }
        }

    }

}
