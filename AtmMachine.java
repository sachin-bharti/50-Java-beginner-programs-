import java.util.*;

public class AtmMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int invalidAttempts = 0;

        while (true) {

            System.out.println("\n===== ATM Machine Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int option = sc.nextInt();

            if (option == 4) {
                System.out.println("Thank you. Goodbye.");
                break;              // exits while-loop and ends program
            }

            switch (option) {

                case 1:
                    invalidAttempts = 0;   // reset because valid input
                    System.out.print("Enter amount: ");
                    int deposit = sc.nextInt();

                    if (deposit <= 0) {
                        System.out.println("Invalid amount.");
                        continue;          // go back to menu
                    }

                    balance += deposit;
                    System.out.println("Deposited: " + deposit);
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    invalidAttempts = 0;
                    System.out.print("Enter amount: ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount.");
                        continue;
                    }

                    if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                        continue;
                    }

                    balance -= withdraw;
                    System.out.println("Withdrawn: " + withdraw);
                    System.out.println("Balance: " + balance);
                    break;

                case 3:
                    invalidAttempts = 0;
                    System.out.println("Current Balance: " + balance);
                    break;

                default:
                    invalidAttempts++;
                    System.out.println("Invalid option. Attempts left: " + (3 - invalidAttempts));

                    if (invalidAttempts == 3) {
                        System.out.println("Too many invalid attempts. Program exiting.");
                        sc.close();
                        return;            // terminate program
                    }
            } // end switch
        } // end while

        sc.close();
    }
}
