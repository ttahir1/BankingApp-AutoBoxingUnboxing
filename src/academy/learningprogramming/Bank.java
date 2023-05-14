package academy.learningprogramming;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i<branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("List of customer details belonging to branch " + branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getCustomer();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + "[" + (i+1) + "]-" + branchCustomer.getCustomerName());
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("Transaction " + (j+1) + " Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
