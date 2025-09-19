package ATM;

import java.util.Scanner;

public class ATM {
        private BankAccount account;
        private Scanner scanner;

        public ATM(BankAccount account) {
            this.account = account;
            this.scanner = new Scanner(System.in);
        }

        public void start() {
            System.out.println("Welcome to the ATM!");

            while (true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1: // Withdraw
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmt = scanner.nextDouble();
                        if (account.withdraw(withdrawAmt)) {
                            System.out.println("Withdrawal successful! Please collect your cash.");
                        } else {
                            System.out.println("Insufficient balance or invalid amount.");
                        }
                        break;
                    case 2: // Deposit
                        System.out.print("Enter amount to deposit: ");
                        double depositAmt = scanner.nextDouble();
                        if (account.deposit(depositAmt)) {
                            System.out.println("Amount deposited successfully.");
                        } else {
                            System.out.println("Invalid deposit amount.");
                        }
                        break;
                    case 3: // Check Balance
                        System.out.println("Current Balance: " + account.getBalance());
                        break;
                    case 4: // Exit
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }

        // Main method to run the program
        public static void main(String[] args) {
            BankAccount account = new BankAccount(10000); // initial balance
            ATM atm = new ATM(account);
            atm.start();
        }
    }
