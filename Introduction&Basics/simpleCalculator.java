//Write a Java program to create a simple calculator using a switch case.
public class simpleCalculator{
    public static void main(String[]args){
        int a=10;
        int b=10;
        char operator='-';
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
    }
}