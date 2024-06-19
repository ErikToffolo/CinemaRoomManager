import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value

        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        if (weekend) {
            cups -= 5;
        }

        System.out.println(cups >= 10 && cups <= 20);
    }
}