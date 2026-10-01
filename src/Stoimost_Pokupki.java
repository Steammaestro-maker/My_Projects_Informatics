import java.util.Scanner;

public class Stoimost_Pokupki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // рублей за пирожок
        int b = scanner.nextInt(); // копеек за пирожок
        int n = scanner.nextInt(); // количество пирожков

        int totalKopecks = (a * 100 + b) * n;

        int rubles = totalKopecks / 100;
        int kopecks = totalKopecks % 100;

        System.out.println(rubles + " " + kopecks);
    }
}