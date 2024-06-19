import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int rowSquares = scanner.nextInt();
        int columnSquares = scanner.nextInt();
        int breakableSquares = scanner.nextInt();
        int totalSquares = rowSquares * columnSquares;

        String isItBreakable = "NO";

        if (
                breakableSquares > 0 &&
                breakableSquares <= totalSquares &&
                        (breakableSquares % rowSquares == 0 ||
                        breakableSquares % columnSquares == 0)
        ) {
            isItBreakable = "YES";
        }

        System.out.println(isItBreakable);
    }
}