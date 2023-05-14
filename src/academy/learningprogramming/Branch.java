package academy.learningprogramming;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customer;
    private String name;

    protected Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return name;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    protected boolean addCustomer(String newCustomer, double initialAmount) {
        if(!(findCustomer(newCustomer) == null)) {
            System.out.println("This customer already exists.");
            return false;
        } else {
            this.customer.add(new Customer(newCustomer, initialAmount));
            return true;
        }
    }

    protected boolean addTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            System.out.println("This transaction was added to the customer's log.");
            return true;
        }else {
            System.out.println("Invalid transaction.");
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        for(int i = 0; i<customer.size(); i++) {
            Customer checkedCustomer = this.customer.get(i);
            if(checkedCustomer.getCustomerName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }




}
