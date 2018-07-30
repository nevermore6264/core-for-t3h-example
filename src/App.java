import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        boolean check = true;
        int total = 0;

        for (int i = 0; i < 4; i++) {

            do {
                System.out.println("Enter a number");
                number = scanner.nextInt();
                if (number > 3 && number < 50) {
                    total += number;
                    check = true;
                } else {
                    System.out.println("Error, try again !");
                    check = false;
                }

            } while (check != true);

        }

        System.out.println("Total is: " + total);
    }
}
