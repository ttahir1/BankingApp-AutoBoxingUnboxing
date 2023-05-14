package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        Bank firstBank = new Bank("HSBC");
        firstBank.addBranch("Rotherham");
        firstBank.addCustomer("Rotherham", "Tayyab Tahir", 200.67);
        firstBank.addCustomer("Rotherham", "David Curtis", 2340.76);
        firstBank.addCustomer("Rotherham", "Jack Holmes", 45.67);

        firstBank.addBranch("Sheffield");
        firstBank.addCustomer("Sheffield", "Bob Hawks", 20.67);
        firstBank.addCustomer("Sheffield", "Sara Perkins", 4400.67);
        firstBank.addCustomer("Sheffield", "Sana Zaheer", 2034.88);

        firstBank.addCustomerTransaction("Rotherham", "Tayyab Tahir", 1870.45);
        firstBank.addCustomerTransaction("Rotherham", "Jack Holmes", 254.65);
        firstBank.addCustomerTransaction("Sheffield", "Sana Zaheer", 180.45);

        firstBank.listCustomers("Rotherham", true);
        firstBank.listCustomers("Sheffield", true);

    }
}
