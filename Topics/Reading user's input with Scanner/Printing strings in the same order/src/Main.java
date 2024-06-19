import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        String fourthWord = scanner.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println(fourthWord);

        scanner.close();
    }
}