import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day = scanner.nextInt();

        if (day >=1 &&  day <=7) {
            System.out.println(dayOfTheWeek[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}

