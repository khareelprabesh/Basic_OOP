package src.Handicraft;

// Subclass: TextileCraft
class TextileCraft extends HandiCraft {
    protected int threadCount;

    public TextileCraft(String craftName, int craftID, double basePrice, int threadCount) {
        super(craftName, craftID, basePrice);
        this.threadCount = threadCount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Thread Count: " + threadCount);
    }

    public int productionTime() {
        return threadCount > 100 ? threadCount / 10 : 10; // Simple assumption of production time
    }
}