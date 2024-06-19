import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int count = 0;
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int i : array) {
            if (i == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}