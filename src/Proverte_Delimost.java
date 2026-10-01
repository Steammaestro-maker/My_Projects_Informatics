import java.util.Scanner;

public class Proverte_Delimost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int x = 1 / (n % m + 1);
        int y = 1 / (m % n + 1);

        System.out.println(x + y - x * y);
    }
}