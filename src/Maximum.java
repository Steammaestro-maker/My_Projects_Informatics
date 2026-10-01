import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int chooseA = (a - b + 1000) / 1000;
        int answer = chooseA * a + (1 - chooseA) * b;

        System.out.println(answer);
    }
}