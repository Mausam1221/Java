import java.util.Scanner;
public class SumOfTwoNum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sum(a,b);
        System.out.println("The sum of two numbers is "+c);
}

public static int sum(int a, int b){
    int sum=a+b;
    return sum;
}
}
