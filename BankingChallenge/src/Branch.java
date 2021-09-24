import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers=new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        Customer tempCustomer = findCustomer(nameOfCustomer);
        if(tempCustomer == null) {
            tempCustomer = new Customer(name=nameOfCustomer, initialTransaction=initialTransaction);
            this.customers.add(tempCustomer);
            return true;
        } else {
            return false;
        }
    }
    private Customer findCustomer(String customerName){
        for(int i=0;i<customers.size();i++){
            Customer customer=customers.get(i);
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }
    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
        Customer tempCustomer = findCustomer(nameOfCustomer);
        if(tempCustomer != null) {
            tempCustomer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

}
