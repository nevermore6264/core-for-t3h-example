import java.util.Scanner;

public class App21_22 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a = ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b = ");
        int b = scanner.nextInt();

        //USCLN
        System.out.println("greatestCommonDivisor " + a + " and " + b
                + " : " + greatestCommonDivisor(a, b));

        //BCSNN
        System.out.println("leastCommonMultiple " + a + " and " + b
                + " : " + leastCommonMultiple(a, b));
    }


    public static int greatestCommonDivisor
            (int a, int b) {
        if (b == 0) return a;
        return greatestCommonDivisor(b, a % b);
    }


    public static int leastCommonMultiple
            (int a, int b) {
        return (a * b) / greatestCommonDivisor(a, b);
    }
}

