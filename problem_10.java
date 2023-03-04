import java.util.Scanner;

//If-else clause in java 
public class problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age:- ");
        int age = sc.nextInt();
        if ( age >= 18) {
            System.out.println("You can Drive");
        } else {
            System.out.println("You cannot Drive");
        }
    }
}
