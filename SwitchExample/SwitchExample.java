package SwitchExample;
public class SwitchExample {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Today is Holiday");
                break;
            case "Tuesday":
                System.out.println("Today is workday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
   }
}
