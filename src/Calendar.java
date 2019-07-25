import java.util.Scanner;

public class Calendar {

    private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int getMaxDaysOfMonth(int month) {
        return MAX_DAYS[month - 1];
    }

    public static void main(String[] args) {
        //Put numbers then will printout the selected months largest day
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();
        System.out.println("Input month number");
        int month = scanner.nextInt();

        System.out.printf("%d month has %dday\n", month, cal.getMaxDaysOfMonth(month));
        scanner.close();
    }
}
