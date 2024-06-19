import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        boolean alphabeticalOrder = true;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].compareTo(input[i + 1]) > 0) {
                alphabeticalOrder = false;
            }
        }
        System.out.println(alphabeticalOrder);
    }
}