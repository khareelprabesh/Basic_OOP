public class movie_rating {
    public static void main(String[] args) {
        double rating = 8.7;
        double root = 0; 
        String feedback = "";
        if (rating >= 1 && rating <= 3) {
            feedback = "Poor";

        } else if (rating >= 4 && rating <= 6 ) {
            feedback = "Average";

        } else if (rating >= 7 && rating <= 8) {
            feedback = "Good";

        } else if (rating >= 9 && rating <= 10) {
            feedback = "Excellent";
        }
        double roundedRating = Math.round(rating);
        double squaredRating = Math.sqrt(rating);
        double roundedtoTwoDecimal = Math.round(rating * 100.0) / 100.0;
        double absoluteDifference = Math.abs(rating - roundedRating);
        double power = Math.pow(rating, 2);
        System.out.println("The square root of the movie rating is " + root);
        System.out.println("The movie rating is " + (int)rating + " and the feedback is " + feedback);
        System.out.println("The movie rating rounded to the nearest whole number is " + roundedRating);
        System.out.println("The square of the movie rating is " + squaredRating);
        System.out.println("The movie rating rounded to two decimal places is " + roundedtoTwoDecimal);
        System.out.println("The absolute difference between the movie rating and 8.7 is " + absoluteDifference);
        System.out.println("The movie rating raised to the power of 2 is " + power);
    }
}