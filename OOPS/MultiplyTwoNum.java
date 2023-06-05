import java.util.Scanner;

public class MultiplyTwoNum{
    public static int CalculateProduct(int a, int b){
  
        return a*b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("The product of two number is "+CalculateProduct(c, d));
    }
}   