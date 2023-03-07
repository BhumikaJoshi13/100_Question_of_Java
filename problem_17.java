//Print star console using loop
public class problem_17 {

    public static void main(String[] args) {
       int row , numberofstars;
       for(row = 1; row<=10;row++)
       {
        for(numberofstars=1;numberofstars<=row;numberofstars++){
            System.out.print("*");
        }
        System.out.println();
       } 
    }
}
