import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean aPositive = a > 0;
        boolean bPositive = b > 0;
        boolean cPositive = c > 0;

        boolean unevenTrue = aPositive ^ bPositive ^ cPositive;
        boolean maxOneTrue = !(aPositive && bPositive) && !(aPositive && cPositive) && !(bPositive && cPositive);
        System.out.println(unevenTrue && maxOneTrue);
    }
}