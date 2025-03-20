package src;
// Superclass: Faculty
class Faculty {
    String name;
    String facultyID;

    // Constructor
    public Faculty(String name, String facultyID) {
        this.name = name;
        this.facultyID = facultyID;
    }

    // Overridden method (to be overridden by subclasses)
    public void displayInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyID);
    }

    // Overloaded method
    public void displayInfo(String department) {
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Department: " + department);
    }
}




// Subclass: Lecturer
class Lecturer extends Faculty {
    String course;

    public Lecturer(String name, String facultyID, String course) {
        super(name, facultyID);
        this.course = course;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Course: " + course);
    }
}

