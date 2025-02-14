import java.util.Scanner;

class Calculator {
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error! Division by zero is not allowed.");
        }
        return a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        // Taking user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        try {
            double result;
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
