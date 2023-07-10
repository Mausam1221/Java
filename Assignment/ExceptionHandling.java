//wap a program to illustrate the use of exception handling
public class ExceptionHandling {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int quotient = dividend / divisor;
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
