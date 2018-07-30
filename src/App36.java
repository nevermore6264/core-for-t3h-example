import java.util.Scanner;

public class App36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number 1 : ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter a number 2 : ");
        double number2 = scanner.nextDouble();

        System.out.println("Enter a operations : ");
        char operations = scanner.next().charAt(0);

        double result = 0;

        switch (operations) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Error");
        }

        System.out.println("Result is: " + result);

    }
}
