import java.util.Scanner;

public class lectronii_Chasi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong() % 86400;

        long hours = n / 3600;
        long minutes = (n % 3600) / 60;
        long seconds = n % 60;

        System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);


    }
}
