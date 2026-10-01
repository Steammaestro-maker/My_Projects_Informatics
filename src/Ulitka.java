import java.util.Scanner;

public class Ulitka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int days = Math.max(1, (h - b + (a - b) - 1) / (a - b));

        System.out.println(days);
    }
}