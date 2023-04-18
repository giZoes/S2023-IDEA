package Ch2;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = {3, 14, 5, 7, 9, 24, 67, 78, 21, 16};
        Arrays.sort(arr);

        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == num) {
                System.out.println();
                break;
            } else if (arr[i] + arr[j] > num) {
                j--;
            } else {
                i++;
            }
        }
        if (i >= j) System.out.println("not found");
    }

}
