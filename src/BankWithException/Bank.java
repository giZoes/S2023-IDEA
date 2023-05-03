package BankWithException;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    // 静态成员变量及初始化
    /********** Begin *********/
    public static List<Customer> customers=new ArrayList<>(10);
    /********** End *********/


    public static int getNumberOfCustomers() {
        /********** Begin *********/
        return customers.size();
        /********** End *********/
    }

    public static void addCustomer(String ln, String fn) {
        /********** Begin *********/
        customers.add(new Customer(ln,fn));
        /********** End *********/
    }

    public static Customer getCustomer(int index) {
        /********** Begin *********/
        return customers.get(index);
        /********** End *********/
    }


}
