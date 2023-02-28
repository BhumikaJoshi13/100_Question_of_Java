//How to Swap  two Number Using 3rd variable Program in Java
import java.util.Scanner;
public class problem_06 {
    public static void main(String[] args) {
       int x , y , temp ;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number 1 ->  ");
       x = sc.nextInt();
       System.out.print("Enter Number 2 ->  ");
       y = sc.nextInt();
       System.out.println("Before Swapping :\nNumber 1 = " + x +"\nNumber 2 = " + y  );
       temp = x;
       x = y;
       y = temp;
       System.out.println("After  Swapping :\nNumber 1 = " + x +"\nNumber 2 = " + y  );
    }
}
