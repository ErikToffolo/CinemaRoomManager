import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean neverNextToEachOther = true;

        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] == n && array[i + 1] == m) {
                neverNextToEachOther = false;
                break;
            } else if (array[i] == m && array[i + 1] == n) {
                neverNextToEachOther = false;
                break;
            }
        }
        System.out.println(neverNextToEachOther);
    }
}