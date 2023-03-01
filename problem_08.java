import java.util.Scanner;

//Wap to add two numbers in java
public class problem_08 {
    public static void main(String[] args) {
       int x , y , z ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Integers to calculate their sum :");
        x = sc.nextInt();
        y = sc.nextInt();
        z = x + y;
        System.out.println("The sum is : " + z);
    }
}
