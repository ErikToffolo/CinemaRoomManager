import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        boolean isSortedAscending = true;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSortedAscending = false;
            }
        }
        System.out.println(isSortedAscending);
    }
}