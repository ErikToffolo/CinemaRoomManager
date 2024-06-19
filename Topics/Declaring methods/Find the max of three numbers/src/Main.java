import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int positionOfMax = 1;
        if (b > a && b >= c) {
            positionOfMax = 2;
        } else if (c > b && c > a) {
            positionOfMax = 3;
        }
        return positionOfMax;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}