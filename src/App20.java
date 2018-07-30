import java.util.Scanner;

public class App20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        double value = Math.sqrt(number);

        if (Math.pow(value, 2) == number) {
            System.out.println("This is square number");
        } else {
            System.out.println("This is not square number");
        }
    }
}
