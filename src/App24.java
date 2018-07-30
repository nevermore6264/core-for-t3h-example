import java.util.Scanner;

public class App24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinitude");
                } else {
                    System.out.println("No result");
                }
            } else {
                double x = -c / b;
                System.out.println("The result of the equation is: " + x);
            }
        } else {
            if (a != 0) {
                double delta = Math.pow(b, 2) - 4 * a * c;
                if (delta <= 0) {
                    System.out.println("No result");
                } else {
                    if (delta == 0) {
                        double x1 = -b / (2 * a);
                        System.out.println("The result of the equation is: " + x1);
                    } else {
                        double sqrDelta = Math.sqrt(delta);
                        System.out.println("Căn Delta là: " + sqrDelta);
                        double x2 = -b + (sqrDelta / (2 * a));
                        double x3 = -b - (sqrDelta / (2 * a));
                        System.out.println("The result of the equation is: " + x2 + "\t and" + x3);
                    }
                }
            }
        }
    }

}
