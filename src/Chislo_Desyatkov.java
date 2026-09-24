import java.util.Scanner;

public class Chislo_Desyatkov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long c = scanner.nextLong();

        long b = (c / 10) % 10;

        System.out.println(b);

    }
}
