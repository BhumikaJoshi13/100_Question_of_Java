//Print reverse number in java 
import java.util.Scanner;
public class problem_19 {
    public static void main(String[] args) {
        int number, reversedNumber = 0, remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}

    
