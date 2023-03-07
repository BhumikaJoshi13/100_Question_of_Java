//While Loop Program in java
import java.util.Scanner;
public class problem_18 {
    public static void main(String[] args) {
        int num ;
        Scanner ab = new Scanner(System.in);
        System.out.print("Input an Integer:- ");
        num = ab.nextInt();
        while( num != 0)
        {
            System.out.println("You entered an Integer");
            System.out.println("Input an Integer");
            num = ab.nextInt();
        }
        System.out.println("Out of Loop");

    }
}
