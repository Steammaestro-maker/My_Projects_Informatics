import java.util.Scanner;

public class Avto_Probeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // километров за день
        int m = scanner.nextInt(); // длина маршрута

        int days = (m + n - 1) / n;
        System.out.println(days);
    }
}