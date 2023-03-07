//wap for while and break
import java.util.Scanner;
public class problem_20 {
    public static void main(String[] args) {
        int num ;
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("Input an Integer");
            num = input.nextInt();

            if( num == 0)
            {
                break;
            }
            System.out.println("You Entered:-" + num);
        }
    }
}
