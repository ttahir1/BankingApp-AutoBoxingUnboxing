package academy.learningprogramming;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String customerName;

    protected Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    protected ArrayList<Double> getTransactions() {
        return transactions;
    }

    protected void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    protected String getCustomerName() {
        return customerName;
    }

    protected void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
