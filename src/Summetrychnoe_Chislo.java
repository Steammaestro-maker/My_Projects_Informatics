import java.util.Scanner;

public class Summetrychnoe_Chislo    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first = number / 1000;
        int second = number / 100 % 10;
        int third = number / 10 % 10;
        int fourth = number % 10;

        int answer = 1
                + (first - fourth) * (first - fourth)
                + (second - third) * (second - third);

        System.out.println(answer);
    }
}