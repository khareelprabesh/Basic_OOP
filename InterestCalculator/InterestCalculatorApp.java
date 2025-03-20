package InterestCalculator;
import java.util.Scanner;

// InterestCalculator class with methods for interest calculation
class InterestCalculator {
    
    // Calculate Simple Interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
    // Calculate Compound Interest
    public double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
}

public class InterestCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterestCalculator calculator = new InterestCalculator();
        
        // Taking user input
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter Rate of interest: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time in years: ");
        double time = scanner.nextDouble();
        
        System.out.print("Enter Interest type (S for Simple Interest, C for Compound Interest): ");
        String interestInput = scanner.next();
        char interestType = interestInput.length() > 0 ? interestInput.charAt(0) : ' ';
        
        double interest;
        switch (Character.toUpperCase(interestType)) {
            case 'S':
                interest = calculator.calculateSimpleInterest(principal, rate, time);
                System.out.println("Simple Interest: " + interest);
                break;
            case 'C':
                interest = calculator.calculateCompoundInterest(principal, rate, time);
                System.out.println("Compound Interest: " + interest);
                break;
            default:
                System.out.println("Invalid interest type!");
        }
        
        scanner.close();
    }
}
