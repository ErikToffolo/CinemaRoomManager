import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();
        int value = 1;
        int totalPrinted = 0;
        do {
            for (int timesPrinted = 1; timesPrinted <= value; timesPrinted++) {
                System.out.print(value + " ");
                totalPrinted++;
                if (totalPrinted == input) {
                    break;
                }
            }
            value++;
        } while (totalPrinted < input);
    }
}