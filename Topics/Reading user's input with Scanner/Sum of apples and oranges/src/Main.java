import java.util.Scanner;

// TODO: Write a program that takes two integer inputs from the user using Scanner
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read the first integer input representing the number of apples
        int apples = scanner.nextInt();

        // TODO: Read the second integer input representing the number of oranges
        int oranges = scanner.nextInt();

        // TODO: Calculate the total number of fruits (apples + oranges)
        scanner.close();
        int sum = apples + oranges;

        // TODO: Print the total number of fruits
        System.out.println(sum);
    }
}