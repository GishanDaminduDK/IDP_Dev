import java.util.ArrayList;
import java.util.List;

class Transaction{
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

class Account {
    private int accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", -amount));
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayTransactions() {
        System.out.println("Transactions for Account #" + accountNumber);
        for (Transaction transaction : transactions) {
            System.out.println("Description: " + transaction.getDescription() +
                    ", Amount: " + transaction.getAmount());
        }
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("Accounts for Customer: " + name);
        for (Account account : accounts) {
            System.out.println("Account #" + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}

class Bank {
    private List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayCustomers() {
        System.out.println("List of Customers in the Bank:");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            customer.displayAccounts();
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Create accounts for customers
        Account account1 = new Account(101);
        Account account2 = new Account(102);
        Account account3 = new Account(201);

        // Add accounts to customers
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer2.addAccount(account3);

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Perform transactions
        account1.deposit(1000);
        account2.deposit(500);
        account2.withdraw(200);
        account3.deposit(1500);
        account3.withdraw(300);

        // Display customer information
        bank.displayCustomers();
    }
}
