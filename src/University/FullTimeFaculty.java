package src.University;

// Subclass: FullTimeFaculty
class FullTimeFaculty extends Faculty {
    double salary;

    public FullTimeFaculty(String name, String facultyID, double salary) {
        super(name, facultyID);
        this.salary = salary;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: $" + salary);
    }
}
