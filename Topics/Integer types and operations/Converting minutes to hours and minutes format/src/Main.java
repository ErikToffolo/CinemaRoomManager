import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        // Your code comes here!
        int hours = minutes / 60;
        int minutesRemaining = minutes % 60;
        System.out.printf(hours + " hours and " + minutesRemaining + " minutes");

        scanner.close();
    }
}