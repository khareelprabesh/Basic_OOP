package src.Handicraft;

// Subclass: MetalCraft
class MetalCraft extends HandiCraft {
    protected double weight;

    public MetalCraft(String craftName, int craftID, double basePrice, double weight) {
        super(craftName, craftID, basePrice);
        this.weight = weight;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Weight: " + weight + " kg");
    }

    public int productionTime() {
        return (int)(weight * 2); // Assuming 2 hours of production time per kg
    }
}
