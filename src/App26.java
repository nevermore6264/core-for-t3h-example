import java.util.Scanner;

public class App26 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = sc.nextInt();

        String string = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                string += i + "\t";
            }
        }
        System.out.println(string);
    }
}