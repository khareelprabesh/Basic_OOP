    import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if (marks>=80){
            System.out.println("Grade B");
        }
        else if(marks>=70){
            System.out.println("Grade C");
        }
        else if(marks>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");}
    }
}