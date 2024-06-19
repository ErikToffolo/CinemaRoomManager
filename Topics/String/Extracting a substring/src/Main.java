import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String s = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(s.substring(a, b + 1));
    }
}