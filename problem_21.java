import java.util.Scanner;

//WAP using while loop break and continue 
public class problem_21 {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer:-");
            num = input.nextInt();
            if ( num != 0) {
                System.out.println("You Entered-"+num);
                continue;
            }
            else{
                break;
            }
            
        }
    }
}
