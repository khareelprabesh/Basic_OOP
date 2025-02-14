import java.util.Scanner;

class TemperatureConverterUtil {
    
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

public class TemperatureConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverterUtil converter = new TemperatureConverterUtil();
        
        // Taking user input
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter conversion type (C for Celsius to Fahrenheit, F for Fahrenheit to Celsius): ");
        String conversionInput = scanner.next();
        char conversionType = conversionInput.length() > 0 ? conversionInput.charAt(0) : ' ';
        
        double convertedTemp;
        switch (Character.toUpperCase(conversionType)) {
            case 'C':
                convertedTemp = converter.celsiusToFahrenheit(temperature);
                System.out.println("Converted Temperature: " + convertedTemp + " °F");
                break;
            case 'F':
                convertedTemp = converter.fahrenheitToCelsius(temperature);
                System.out.println("Converted Temperature: " + convertedTemp + " °C");
                break;
            default:
                System.out.println("Invalid conversion type!");
        }
        
        scanner.close();
    }
}
