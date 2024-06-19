import java.util.Scanner; // essential import for user input

public class Main {
    public static void main(String[] args) {
        // Create a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        // TODO: Get an integer input from the user
        int n = scanner.nextInt();

        // TODO: Calculate the square of the input
        int square = n * n;

        // TODO: Print the result out
        System.out.println(square);

        // Important to close the scanner!
        scanner.close();
    }
}