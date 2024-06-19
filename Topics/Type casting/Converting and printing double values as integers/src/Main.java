import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the number as a double.
//        // TODO: Write your code here to read a double from the console
//        double input = scanner.nextDouble();
//
//        // Convert and print the number to an integer.
//
//        // TODO: Write your code here to convert the double to an integer and print it out to the console
//        int output = (int) input;
//        System.out.println(output);
//
//        scanner.close();
        double d1 = 15.99;
        int i = (int) d1;
        double d2 = 123456789.987;
        long l = (long) d2;
        float f = (float) d2;
        double d3 = 0.000123456789987654321;
        long l2 = (long) d3;
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
        System.out.println("i: " + i);
        System.out.println("l: " + l);
        System.out.println("f: " + f);
        System.out.println("l2: " + l2);
    }
}