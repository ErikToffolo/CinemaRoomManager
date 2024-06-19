import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare two int variables for the calculation
        int five = 5;
        int three = 3;

        // Use Scanner to read the operator input
        Scanner scanner = new Scanner(System.in);
        char operator = scanner.nextLine().charAt(0);

        // Perform the operation based on the operator and print the result
        switch (operator) {
            case '+':
                System.out.println(five + three);
                break;
            case '-':
                System.out.println(five - three);
                break;
            case '*':
                System.out.println(five * three);
                break;
            case '/':
                // Integer division
                System.out.println(five / three);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}