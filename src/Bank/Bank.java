package Bank;

public class Bank {
    private static Customer[] customers=new Customer[10];
    private static int numberOfCustomers=0;
    public static void addCustomer(String firstName,String lastName) {
        customers[numberOfCustomers++]= new Customer(firstName,lastName);
    }
    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }
    public static Customer getCustomer(int index) {
        return customers[index];
    }
}
