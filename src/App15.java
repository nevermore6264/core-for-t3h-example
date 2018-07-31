import java.util.Scanner;

public class App15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        long total = 1;

        if (number == 0 || number == 1) {
            total = number;
            System.out.println("Result is :" + total);
        } else {
            for (int i = 2; i <= number; i++) {
                total *= i;
            }
            System.out.println("Result is :" + total);
        }

    }
}
