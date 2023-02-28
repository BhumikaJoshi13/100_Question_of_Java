//Write a program to convert Farenheit to celsius Program in Java 
import java.util.Scanner;
public class Problem_05 {
    public static void main(String[] args) {
      float temperature;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Temperature in Farenheit");
      temperature = sc.nextFloat();
      temperature = ((temperature-32)*5)/9;
      System.out.println("Temperature in Celius = " + temperature);
    }
}
