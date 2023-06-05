//Write a Java program to check if the number is odd or even.
import java.util.Scanner;

public class conditions {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number more than 1: ");
        int num= scanner.nextInt();
        if(num%2==0 )
        {
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
            scanner.close();
        }
    }
}
