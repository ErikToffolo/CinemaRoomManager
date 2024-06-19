import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Take integer input from the user
        int number = scanner.nextInt();

        // Use a simple way to determine if the number is even or odd.
        number %= 2;

        // If it's even, print true, otherwise, print false
        boolean isEven = false;
        if (number == 0) {
            isEven = true;
        }

        System.out.println(isEven);

        // Write your code here       
    }
}