import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        input /= 10;
        input %= 10;
        System.out.println(input);
    }
}