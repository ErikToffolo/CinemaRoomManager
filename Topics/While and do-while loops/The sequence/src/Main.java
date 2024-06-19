import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int numberCount = scanner.nextInt();
        int counter = 0;
        int hightestDivisibleByFour = 0;

        while (counter < numberCount) {
            int number = scanner.nextInt();
            hightestDivisibleByFour = number > hightestDivisibleByFour && number % 4 == 0 ?
                    number : hightestDivisibleByFour;
            counter++;
        }
        System.out.println(hightestDivisibleByFour);
    }
}