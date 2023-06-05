public class Methods {
    public static int add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;
        int num3 = 12;
        
        int sum = add(num1, num2, num3);
        
        System.out.println("The sum is: " + sum);
    }
}
