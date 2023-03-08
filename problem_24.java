//Print Multiplication table in Java
import java.util.Scanner;
public class problem_24 {
    public static void main(String[] args) {
        int num , i ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Integer :- ");
        num = input.nextInt();
        for( i=1 ; i<=10;i++)
        {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
