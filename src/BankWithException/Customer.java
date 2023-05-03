package BankWithException;

import java.util.ArrayList;
import java.util.List;
public class Customer extends Object {
    private String firstName;
    private String lastName;
    /********** Begin *********/
    private List<Account> accounts;
    /********** End *********/

    public Customer(String ln, String sn) {
        this.lastName = ln;
        this.firstName = sn;
        /********** Begin *********/
        accounts=new ArrayList<>(10);
        /********** End *********/
    }
    // getter方法
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfAccounts() {
        /********** Begin *********/
        return accounts.size();
        /********** End *********/
    }

    public String toString() {
        return "[" + lastName + ", " + firstName + "]";
    }

    // 业务逻辑方法：
    public void addAccount(double amount) {
        /********** Begin *********/
        accounts.add(new Account(amount));
        /********** End *********/
    }

    public void addAccount(Account account) {
        /********** Begin *********/
        accounts.add(account);
        /********** End *********/	}

    // 查看某一个账户的信息
    public Account getAccount(int index) {
        /********** Begin *********/
        return accounts.get(index);
        /********** End *********/	}
}