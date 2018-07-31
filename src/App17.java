import java.util.Scanner;

public class App17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("You must enter a number >0");
        } else {
            int total = 0;

            int multiplication = 1;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    total += i;
                    multiplication *= i;
                }
            }

            System.out.println("Total : " + total);
            System.out.println("Multiplication : " + multiplication);
        }
    }
}
