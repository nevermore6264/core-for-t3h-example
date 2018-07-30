import java.util.Scanner;

public class App19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        // so nguyen n < 2 khong phai la so nguyen to
        if (number < 2) {
            System.out.println("It is not Prime !");
        }

        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(number);

        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                System.out.println("It is not Prime !");
            }
        }

        System.out.println("It is Prime !");
    }

}

