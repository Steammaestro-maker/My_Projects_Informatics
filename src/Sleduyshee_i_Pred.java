import java.util.Scanner;

public class Sleduyshee_i_Pred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();

        System.out.println("The next number for the number " + b
                + " is " + (b + 1) + ".");

        System.out.println("The previous number for the number " + b
                + " is " + (b - 1) + ".");

        scanner.close();
    }
}
