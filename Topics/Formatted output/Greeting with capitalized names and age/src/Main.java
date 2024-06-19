import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first name
        String firstName = scanner.nextLine();

        // Read the last name
        String lastName = scanner.nextLine();

        // Read the age as an integer
        int age = scanner.nextInt();

        // Print the greeting message
        firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
        lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1);
        System.out.printf("Hello, %s %s. You are %d years old.", firstName, lastName, age);
    }
}