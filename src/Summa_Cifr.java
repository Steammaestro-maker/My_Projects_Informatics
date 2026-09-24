import java.util.Scanner;

public class Summa_Cifr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;

        System.out.println(b+c+d);

    }
}
