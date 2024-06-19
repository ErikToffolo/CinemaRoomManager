import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);


        // Read the number of apples from the user
        int apples = scanner.nextInt();


        // Read the number of oranges from the user
        int oranges = scanner.nextInt();


        // Calculate the total number of fruits
        scanner.close();
        int sum = apples + oranges;


        // Print the result
        System.out.println(sum);

    }
}