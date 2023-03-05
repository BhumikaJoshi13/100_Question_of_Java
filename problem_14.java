//Find Factorial Of Given Number
import java.util.Scanner;
public class problem_14 {

    public static void main(String[] args) {
        int num ;
        int fact =1;
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter any Number: ");
         num = sc.nextInt();
if ( num < 0) {
    System.out.println("Enter non-negative Number");
    
} else {
    for( int c=1; c<=num ; c++)
    fact = fact *c;
    System.out.println("The factorial is " + fact);
}
    
}
}