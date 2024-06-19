import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();

        int firstDigit = input % 10;

        int secondDigit = input / 10;
        secondDigit %= 10;

        int thirdDigit = input / 100;
        thirdDigit %= 10;

        if (firstDigit != 0) {
            System.out.print(firstDigit);
        }
        System.out.print(secondDigit);
        System.out.print(thirdDigit);
    }
}