import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean ab = a + b == 20;
        boolean ac = a + c == 20;
        boolean bc = b + c == 20;

        System.out.println(ab || ac || bc);
    }
}