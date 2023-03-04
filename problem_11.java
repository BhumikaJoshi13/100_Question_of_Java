import java.util.Scanner;

//Program for If-else clause
public class problem_11 {
    public static void main(String[] args) {
        int marksobtained , passingmarks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks Obtained:- ");
        marksobtained = sc.nextInt();
        passingmarks = 40;
        if (marksobtained >= passingmarks) {
            System.out.println("You are pass");
        } 
        else {
            System.out.println("You are fail.");
        }
    }
}
