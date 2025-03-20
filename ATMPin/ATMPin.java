package ATMPin;
import java.util.Scanner;

public class ATMPin {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pin = 1234; // Correct PIN
        int userpin;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5; // Maximum allowed attempts

        do {
            System.out.println("Enter your pin: ");
            userpin = sc.nextInt();

            if (userpin == pin) {
                checkbalance(sc); // Proceed to account operations if PIN is correct
                break; // Exit the loop after successful PIN entry
            } else {
                attempts++; // Increment attempts for invalid PIN
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Invalid pin. You have " + (MAX_ATTEMPTS - attempts) + " attempts left.");
                } else {
                    // Trigger countdown when attempts reach MAX_ATTEMPTS
                    System.out.println("You have entered the wrong pin too many times. Please wait for the countdown.");
                    for (int i = 10; i >= 1; i--) {
                        System.out.println(i);
                        try {
                            Thread.sleep(1000); // 1-second delay
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    attempts = 0; // Reset attempts after countdown
                }
            }
        } while (true); // Loop indefinitely until correct PIN is entered
    }

    private static void checkbalance(Scanner sc) {
        int balance = 17000; // Initial balance
        while (true) {
            System.out.println("Welcome to your account.");
            System.out.println("Your balance is: " + balance);
            System.out.println("Would you like to make a deposit or withdrawal?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you would like to deposit: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your new balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount you would like to withdraw: ");
                    int withdrawal = sc.nextInt();
                    if (withdrawal > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Your new balance is: " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using our ATM. Have a good day.");
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
