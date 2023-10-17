import java.util.*;

class BankAccount {
     double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: INR " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: INR " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }
}

class ATM {
     BankAccount userAccount;
     Scanner sc;
    public ATM() {
    sc = new Scanner(System.in);
    }

     void start(BankAccount account) {
        userAccount = account;

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Select an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit();
                    return;
                default:
                    System.out.println("Invalid option. Please select again.");
                    break;
            }
        }
    }

    void checkBalance() {
        double balance = userAccount.getBalance();
        System.out.println("Current balance: INR " + balance);
    }

     void deposit() {
        System.out.print("Enter the deposit amount: INR");
        double amount = sc.nextDouble();
        userAccount.deposit(amount);
    }

     void withdraw() {
        System.out.print("Enter the withdrawal amount: INR");
        double amount = sc.nextDouble();
        userAccount.withdraw(amount);
    }

     void exit() {
        System.out.println("Exiting ATM. Thank you for using our services.");
        sc.close();
    }
}

 class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(1000.0);

        // Create an ATM instance and start the interaction
        ATM atm = new ATM();
        atm.start(account);
    }
}