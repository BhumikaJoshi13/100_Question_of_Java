//How to compete two Strings
import java.util.Scanner;
public class problem_15 {
    public static void main(String[] args) {
        String s1 , s2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        s1 = sc.nextLine();
        System.out.println("Enter second String");
        s2 = sc.nextLine();
        if (s1.compareTo(s2)>0) {
            System.out.println("String 1 is greater");
        } else if (s1.compareTo(s2)<0) {
            System.out.println("String 2  is greater");
        }
        else{
            System.out.println("Both are same");
        }

    }
}
