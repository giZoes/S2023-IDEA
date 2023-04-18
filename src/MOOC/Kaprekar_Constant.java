package MOOC;

import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar_Constant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=-1;
        do {
            System.out.println("Enter a positive integer N in the range of 0 to 10000:");
            n=scanner.nextInt();
        }while (n<1||n>9999);
        scanner.close();
        Kaprekar(n);
    }
    final static int kapre=6174;
    static void Kaprekar(int num) {
        int[] arrayInt=intToArray(num);
        if (isAllEqual(arrayInt)){
            System.out.println("N - N = 0");
        }else {
            Arrays.sort(arrayInt);
            int[] ds=DescendingSort(arrayInt);
            int AS=arrayToInt(arrayInt),DS=arrayToInt(ds);
            if (DS- AS !=kapre){
                System.out.printf("%04d-%04d=%04d\n",DS,AS,DS-AS);
                Kaprekar(DS-AS);
            }else{
                System.out.printf("%04d-%04d=%04d\n",DS,AS,DS-AS);
            }
        }
    }
    static boolean isAllEqual(int[] arrayInt){
        return arrayInt[0] == arrayInt[1] &&
                arrayInt[1] == arrayInt[2] &&
                arrayInt[2] == arrayInt[3];
    }
    static int[] DescendingSort(int[] arrayInt){
        Arrays.sort(arrayInt);
        int[] Descending=new int[4];
        for (int i = 0; i < 4; i++) {
            Descending[i]=arrayInt[3-i];
        }
        return Descending;
    }
    static int arrayToInt(int[] arrayInt){
        int sum=0;
        for (int i = 0; i <4; i++) {
            sum*=10;
            sum+=arrayInt[i];
        }
        return sum;
    }
    static int[] intToArray(int num){
        int[] arrayInt=new int[4];
        for (int i = 0; i < 4; i++) {
            arrayInt[i]=num%10;
            num/=10;
        }
        return arrayInt;
    }
}
