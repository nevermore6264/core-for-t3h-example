import java.util.Scanner;

public class App16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("You must enter a number >0");
        } else {
            String result = "";
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    result += i + "\t";
                }
            }
            System.out.println("List : " + result);
        }
    }
}
