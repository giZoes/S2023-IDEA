package String_Class;

import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        String data=scanner.next();
        String name=scanner.next();
        int size=0;
        do {
            System.out.println(data.indexOf(name,size));
            size=data.indexOf(name,size)+name.length();
        }while (data.indexOf(name,size)!=-1);
        scanner.close();
        /********** End *********/
    }
}
