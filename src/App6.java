import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += (double) 1 / (i * (i + 1));
        }

        System.out.println("Total is:" + sum);
    }
}
