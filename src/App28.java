import java.util.Scanner;

public class App28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter h:");

        int h = scanner.nextInt();

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < i + h; j++) {
                if (j < h - 1 - i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }

            System.out.println();
        }
    }
}
