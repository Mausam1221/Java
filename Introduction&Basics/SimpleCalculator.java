//Write a Java program to create a simple calculator using a switch case.
import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first Number: ");
        int a=scanner.nextInt();
        System.out.println("Enter the second Number: ");
        int b=scanner.nextInt();
        System.out.println("which operation you want to perform  (+,-,/,*)" );
        int operator=scanner.next().charAt(0);
        // char operator='-';
        switch(operator){
            case '+':
            System.out.println("Result:"+ (a+b));
            break;
            case '-':
            System.out.println("Result:"+ (a-b));
            break;
            case '/':
            System.out.println("Result:"+ a/b);
            break;
            case '*':
            System.out.println("Result:"+ a*b);
            break;
        }
        scanner.close();
    }
}