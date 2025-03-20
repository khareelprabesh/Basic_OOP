package AreaCalculatorApp;
import java.util.Scanner;

class AreaCalculator {
    
    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    
    public double areaOfRectangle(double length, double width) {
        return length * width;
    }
    
    public double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
}

public class AreaCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();
        
        // Taking user input
        System.out.print("Choose shape (circle, rectangle, triangle): ");
        String shape = scanner.next().toLowerCase();
        
        double area;
        switch (shape) {
            case "circle":
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                area = calculator.areaOfCircle(radius);
                System.out.println("Area of Circle: " + area);
                break;
            case "rectangle":
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                area = calculator.areaOfRectangle(length, width);
                System.out.println("Area of Rectangle: " + area);
                break;
            case "triangle":
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                area = calculator.areaOfTriangle(base, height);
                System.out.println("Area of Triangle: " + area);
                break;
            default:
                System.out.println("Invalid shape selection!");
        }
        
        scanner.close();
    }
}
