package src.University;

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
