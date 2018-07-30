import java.util.Scanner;


public class App23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinitude");
            } else {
                System.out.println("No result");
            }
        } else {
            double x = -b / a;
            System.out.println("The result of the equation is: " + x);
        }
    }
}
