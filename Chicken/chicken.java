package Chicken;


public class chicken {
    public static void main(String[] args) {
        // int eggsPerChicken = 5;
        // int chickenCount = 3;
        // int totalEggsonMonday = eggsPerChicken * chickenCount;
        // System.out.println("Total Eggs on Monday: " + totalEggsonMonday);

        // chickenCount++;
        // int totalEggsonTuesday = eggsPerChicken * chickenCount;
        // System.out.println("Total Eggs on Tuesday: " + totalEggsonTuesday);

        // chickenCount/= 2;
        // int totalEggsonWednesday = eggsPerChicken * chickenCount;
        // System.out.println("Total Eggs on Wednesday: " + totalEggsonWednesday);

        // int totalEggs = totalEggsonMonday + totalEggsonTuesday + totalEggsonWednesday;
        // System.out.println("Total no of Eggs: " + totalEggs);

        int eggsMonday = 100;
        int eggsTuesday = 121;
        int eggsWednesday = 117; 
        double dailyAverage = (eggsMonday + eggsTuesday + eggsWednesday)/ 3.0;
        System.out.println(dailyAverage);

        double monthlyAverage = dailyAverage * 30;
        System.out.println(monthlyAverage);

        double monthlyProfit = monthlyAverage * 0.18;
        System.out.println("The total Profit is :$" + monthlyProfit);
    
    }
}
