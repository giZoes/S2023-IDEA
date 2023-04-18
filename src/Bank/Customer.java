package Bank;

public class Customer {
    Account[] accounts;
    int numberOfAccounts;
    String firstName;
    String lastName;
    public Customer(){}
    public Customer(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        accounts=new Account[10];
        numberOfAccounts=0;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public void addAccount(Account accounts) {
        this.accounts[numberOfAccounts++]=accounts;
    }
    public void addAccount(double amt){
        accounts[numberOfAccounts++]=new Account(amt);
    }
    public Account getAccount(int index){
        return accounts[index];
    }
    public String toString(){
        return "["+lastName+", "+firstName+"]";
    }
}
