import java.util.Scanner;

public class Delezh_Yablok3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int r = k % n;
        int answer = (n - r) * ((r + n - 1) / n);

        System.out.println(answer);
    }
}