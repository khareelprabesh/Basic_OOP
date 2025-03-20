package StepTracker;
public class step_tracker {
    public static void main(String[] args) {
        int stepsWalked = 7000;
        int rewardPoint = 0;
        String activityLevel = "";
        if (stepsWalked < 5000){
            activityLevel = "Sedentary Lifestyle";
            rewardPoint = 0;
        }

        else if (stepsWalked >= 5000 && stepsWalked < 10000){
            rewardPoint ++;
            activityLevel = "Moderately Active" + " Lifestyle";
        }

        else if (stepsWalked >= 10000 && stepsWalked < 20000){
            rewardPoint += 2;
            activityLevel = "Active" + " Lifestyle";
        }
       
        else if(stepsWalked >= 20000){
            rewardPoint += 3;
            activityLevel = "Highly Active" + " Lifestyle";
        }
        
        else {
            activityLevel = "Weakly Active" + " Lifestyle";
        }
        System.out.println("Activity Lifestyle :" + activityLevel);
        System.out.println("Reward :" + rewardPoint + " bagde");
        System.out.println("Total Calorie Burned : " + (Math.round(stepsWalked * 0.04)));
    }
}
