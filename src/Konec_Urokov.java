import java.util.Scanner;

public class Konec_Urokov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int minutes = 45 * n + 5 * (n / 2) + 15 * ((n - 1) / 2);

        int hours = 9 + minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println(hours + " " + remainingMinutes);
    }
}