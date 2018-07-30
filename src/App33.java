import java.util.Scanner;

public class App33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value of length : ");
        int length = scanner.nextInt();

        System.out.println("Enter a value of height  : ");
        int height = scanner.nextInt();


        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1 || i == length || j == 1 || j == height){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
