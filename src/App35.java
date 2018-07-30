import java.util.Calendar;
import java.util.Scanner;

public class App35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your birthday: ");
        String birthday = scanner.nextLine();

        int yourYear = Integer.parseInt(birthday.substring(birthday.length() - 4, birthday.length()));

        Calendar c = Calendar.getInstance();
        int nowYear = c.get(Calendar.YEAR);

        int age = nowYear - yourYear;
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}
