import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double sum = 0;
        int devByThreeCounter = 0;

        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                devByThreeCounter++;
            }
        }
        System.out.println(sum / devByThreeCounter);
    }
}