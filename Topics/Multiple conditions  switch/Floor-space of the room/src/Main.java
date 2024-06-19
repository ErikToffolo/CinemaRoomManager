import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // start coding here

        String shape = scanner.nextLine();

        switch (shape) {
            case "triangle":
                double s1 = scanner.nextDouble();
                double s2 = scanner.nextDouble();
                double s3 = scanner.nextDouble();
                double s = (s1 + s2 + s3) / 2;
                double trianleArea = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
                System.out.println(trianleArea);
                break;
            case "rectangle":
                double height = scanner.nextDouble();
                double width = scanner.nextDouble();
                System.out.println(height * width);
                break;
            case "circle":
                double radius = scanner.nextDouble();
                System.out.println(radius * radius * 3.14);
                break;
            default:
                break;
        }
    }
}