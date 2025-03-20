package src;

// Main class
public class University {
    public static void main(String[] args) {
        // Creating an array of Faculty objects
        Faculty[] facultyMembers = new Faculty[3];

        // Assigning subclass objects dynamically (demonstrating polymorphism)
        facultyMembers[0] = new Staff("Alice", "S101", "Administrator");
        facultyMembers[1] = new FullTimeFaculty("Bob", "F202", 75000);
        facultyMembers[2] = new Lecturer("Charlie", "L303", "Computer Science");

        // Demonstrating runtime polymorphism by calling overridden methods
        System.out.println("### Runtime Polymorphism Demonstration ###");
        for (Faculty faculty : facultyMembers) {
            faculty.displayInfo();
            System.out.println("----------------------------");
        }

        // Demonstrating method overloading
        System.out.println("\n### Method Overloading Demonstration ###");
        for (Faculty faculty : facultyMembers) {
            faculty.displayInfo("Engineering Department"); // Overloaded method
            System.out.println("----------------------------");
        }
    }
}
