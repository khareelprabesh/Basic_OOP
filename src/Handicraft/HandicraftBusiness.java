package src.Handicraft;

// Main Method: Testing the system
public class HandicraftBusiness {
    public static void main(String[] args) {
        HandiCraft[] crafts = new HandiCraft[5];

        crafts[0] = new TextileCraft("Dhaka Topi", 101, 500, 80);
        crafts[1] = new MetalCraft("Khukuri", 102, 1200, 1.5);
        crafts[2] = new WoodenCraft("Madush", 103, 3000, 50, "Sal");
        // Additional crafts can be added
        crafts[3] = new TextileCraft("Buddha Cloth", 104, 450, 150);
        crafts[4] = new MetalCraft("Brass Bell", 105, 700, 2.0);

        for (HandiCraft craft : crafts) {
            // Check runtime polymorphism
            craft.displayDetails();
            // Show availability
            craft.displayDetails(true);
            // Calculate export price
            System.out.println("Export Price with 10% tax: NPR " + craft.calculateExportPrice(10));
            // Call production time for applicable crafts
            if (craft instanceof TextileCraft) {
                System.out.println("Production Time: " + ((TextileCraft) craft).productionTime() + " hours");
            } else if (craft instanceof MetalCraft) {
                System.out.println("Production Time: " + ((MetalCraft) craft).productionTime() + " hours");
            }
            System.out.println("---------------");
        }
    }
}
