package String_Class;

import java.util.Scanner;

public class Roster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        String roster1=scanner.nextLine();
        String roster2=scanner.nextLine();
        System.out.println(roster1.length());
        System.out.println(roster2.length());
        if (roster1.compareTo(roster2)!=0){
            System.out.println("不相同");
        }else{
            System.out.println("相同");
        }
        scanner.close();
        /********** End *********/
    }
}
