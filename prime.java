import java.util.Scanner;
public class prime {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1. Print all the prime number between 1 to 100.");
        System.out.println("2. Find the factorial of a given number.");
        System.out.println("3. Exit the program.");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                printnum();
                break;
            case 2:
                fact();
                break;
            case 3:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid Choice!!");
                break;
        }
    }
    public static void printnum(){
    System.out.println("The prime number upto 100 natural numbers are:");
    for(int i = 2 ; i <= 100 ; i++){
        if (isPrime(i)) {
            System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
        return false;
    }
        for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
    public static void fact(){

    System.out.println("Enter the number whose factorial is to be calculated:");
    int num = sc.nextInt();
    int fact = 1;
    int i = 1;
    while(i <= num){
        if (num == 0) {
            System.out.println("");
        }
      fact *= i;
        i++;
    }
    System.out.println("The factorial of "+num+" is "+fact);
    }
}