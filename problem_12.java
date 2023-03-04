import java.util.Scanner;

public class problem_12 {
    public static void main(String[] args) {
        int marksobtained, passingmarks;
        char grade;

        passingmarks = 40;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks Obtained:- ");
        marksobtained = sc.nextInt();

        if (marksobtained >= passingmarks) {
            if (marksobtained > 90)
                grade = 'A';
            else if (marksobtained > 75)
                grade = 'B';
            else if (marksobtained > 60)
                grade = 'C';
            else
                grade = 'D';

            System.out.println("You passed and your grade is " + grade);
        } else {
            System.out.println("You failed the exam.");
        }
    }
}
