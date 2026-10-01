import java.util.Scanner;

public class Electrnii_Chasi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 1440;

        int hours = n / 60;
        int minutes = n % 60;

        System.out.println(hours + " " + minutes);
    }
}