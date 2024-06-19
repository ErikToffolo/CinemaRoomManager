import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String s = scanner.nextLine();
        System.out.println(s.replaceAll("a", "b"));
    }
}