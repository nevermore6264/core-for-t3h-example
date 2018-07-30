import java.util.Scanner;

public class App34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your id: ");
        int id = scanner.nextInt();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your math mark");
        double math = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter your chemistry mark");
        double chemistry = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter your physical mark");
        double physical = Double.parseDouble(scanner.nextLine());

        double avg = (math + chemistry + physical) / 3;

        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Avg: " + avg);

    }
}
