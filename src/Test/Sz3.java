package Test;

import java.util.Scanner;

public class Sz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //动态创建数组
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        /********** Begin **********/
        /* 
        
        Arrays.sort(arr);
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            arr[i]=arr1[arr1.length-i-1];
        }
        System.out.println(Arrays.toString(arr));

        */


        /********** End **********/
    }
}
