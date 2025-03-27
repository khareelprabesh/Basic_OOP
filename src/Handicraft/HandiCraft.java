package src.Handicraft;

// Superclass: Handicraft
class HandiCraft {
    protected String craftName;
    protected int craftID;
    protected double basePrice;

    public HandiCraft(String craftName, int craftID, double basePrice) {
        this.craftName = craftName;
        this.craftID = craftID;
        this.basePrice = basePrice;
    }

    public void displayDetails() {
        System.out.println("Craft Name: " + craftName);
        System.out.println("Craft ID: " + craftID);
        System.out.println("Base Price: NPR " + basePrice);
    }

    public void displayDetails(boolean isAvailable) {
        displayDetails();
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public double calculateExportPrice(double taxRate) {
        return basePrice + (basePrice * taxRate / 100);
    }
}
