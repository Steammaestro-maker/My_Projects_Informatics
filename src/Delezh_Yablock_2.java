import java.util.Scanner;

public class Delezh_Yablock_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int k = scanner.nextInt();
            int f = scanner.nextInt();
            int c = f % k;

            System.out.println(c);

        }
    }
