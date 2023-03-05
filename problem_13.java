import java.util.Scanner;

//Program to check odd or even Number 
public class problem_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x ;
        System.out.println("Enter any Number: ");
        x = sc.nextInt();
        if (x%2 ==0) {
            System.out.println("Even ");
        } else {
            System.out.println("Odd");
        }
    }
}
