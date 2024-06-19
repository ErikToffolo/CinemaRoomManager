import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;

        for (int i = 0; i < n; i++) {
            String grade = scanner.next();
            if ("A".equals(grade)) {
                a++;
            } else if ("B".equals(grade)) {
                b++;
            } else if ("C".equals(grade)) {
                c++;
            } else if ("D".equals(grade)) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}