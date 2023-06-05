public class MultiplicationTables {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 1; i <= n; i++) {
            System.out.println("Multiplication Table of " + i + ":");
            System.out.println("---------------------------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}