import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return false;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000.0);

        boolean running = true;
        while (running) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmt = scanner.nextDouble();
                    userAccount.deposit(depositAmt);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmt = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmt);
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}