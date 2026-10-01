import java.util.Scanner;

public class Sled_Chetnoe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println(a + 2 - (a % 2));


    }
}