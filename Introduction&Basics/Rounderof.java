//Write a Java program to round a number in n decimal places.
public class Rounderof {
    public static double roundToDecimalPlaces(double number, int decimalPlaces) {
        double powerOfTen = Math.pow(10, decimalPlaces);
        return Math.round(number * powerOfTen) / powerOfTen;
    }

    public static void main(String[] args) {
        double number = 3.14159265359;
        int decimalPlaces = 3;
        double roundedNumber = roundToDecimalPlaces(number, decimalPlaces);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + roundedNumber);
    }
}