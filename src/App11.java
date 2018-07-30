import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of number: ");
        int number = sc.nextInt();

        int i = 1;
        int total = 0;
        while (i <= number) {
            int j = 1;
            int result = 1;
            while (j <= i) {
                result *= j;
                j++;
            }
            total += result;
            i++;
        }
        System.out.println("Total is: " + total);
    }
}
