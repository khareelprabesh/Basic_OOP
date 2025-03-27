package src.University;
// Subclass: Staff

class Staff extends Faculty {
    String role;

    public Staff(String name, String facultyID, String role) {
        super(name, facultyID);
        this.role = role;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
    }
}
