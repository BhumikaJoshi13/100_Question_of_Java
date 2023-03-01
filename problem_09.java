import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

//WAP TO FIND LARGEST NUMBER IN JAVA 
public class problem_09 {
    public static void main(String[] args) {
        int a , b ,c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ( a > b && a > c) {
            System.out.println("First Number is greater ");
        } 
        else  if ( b > a && b > c) {
            System.out.println("Second number is greater");
        }
        else{
            System.out.println("Third Number is greater ");
        }
    }
}
