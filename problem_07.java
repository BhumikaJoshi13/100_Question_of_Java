//Write a Program to swap two numbers without using 3rd variable 
import java.util.Scanner;
public class problem_07 {
    public static void main(String[] args) {
        int x , y  ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 ->  ");
        x = sc.nextInt();
        System.out.print("Enter Number 2 ->  ");
        y = sc.nextInt();
        System.out.println("Before Swapping :\nNumber 1 = " + x +"\nNumber 2 = " + y  );  
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping :\nNumber 1 = " + x +"\nNumber 2 = " + y  );

    }
}
