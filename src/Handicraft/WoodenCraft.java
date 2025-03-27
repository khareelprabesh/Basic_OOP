package src.Handicraft;

// Subclass: WoodenCraft (Extends TextileCraft)
class WoodenCraft extends TextileCraft {
    private String woodType;

    public WoodenCraft(String craftName, int craftID, double basePrice, int threadCount, String woodType) {
        super(craftName, craftID, basePrice, threadCount);
        this.woodType = woodType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wood Type: " + woodType);
    }

    // No need to override productionTime() as it's inherited from TextileCraft
}
