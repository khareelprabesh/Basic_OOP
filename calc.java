import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        calc.num1 = sc.nextDouble();
        System.out.println("Enter your second number: ");
        calc.num2 = sc.nextDouble();
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for product");
        System.out.println("press 4 for division");
        System.out.println("press 5 for remainder");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                calc.add();
                break;
            case 2:
                calc.sub();
                break;
            case 3:
                calc.product();
                break;
            case 4:
                calc.divide();
                break;
            case 5:
                calc.remainder();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
