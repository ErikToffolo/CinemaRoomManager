import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int totaal = 0;
        int input;

        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            totaal += input;
            if (totaal >= 1000) {
                totaal -= 1000;
                break;
            }
        }
        System.out.println(totaal);
    }
}