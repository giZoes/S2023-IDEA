package MOOC;

import java.util.Scanner;

public class Fibonacci_sequence {
    public static void main(String[] args) {
        System.out.println("Please input a integer:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(),sum=0;
        System.out.println("The sum of the first "+n+" terms of the Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            sum+=(i+1);
        }
        System.out.println(sum);
    }
}
