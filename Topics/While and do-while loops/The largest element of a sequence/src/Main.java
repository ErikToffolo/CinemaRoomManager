import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input;
        int largest = 0;
        do {
            input = scanner.nextInt();
            largest = input > largest ? input : largest;
        } while (input != 0);
        System.out.println(largest);
    }
}