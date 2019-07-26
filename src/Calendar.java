import java.util.Scanner;

public class Calendar {

    private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int getMaxDaysOfMonth(int month) {
        //        switch (month) {
        //        case 2:
        //            return 28;
        //        case 3:
        //            return 30;
        //        default:
        //            return 31;
        //        }
        //        if (month == 1) {
        //            return 31;
        //        } else if (month == 2) {
        //            return 28;
        //        }
        return MAX_DAYS[month - 1];
    }

    public static void main(String[] args) {
        //Put numbers then will printout the selected months largest day
        String PROMPT = "cal> ";
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = 1;
        //Error occurred because 'cal.getMaxDaysOfMonth is executed at least 1 time
        while (true) {
            System.out.println("Input month");
            System.out.println(PROMPT);
            month = scanner.nextInt();
            if (month < 1) {
                break;
            }
            if (month > 12) {
                continue;
            }
            System.out.printf("%d month has %dday\n", month, cal.getMaxDaysOfMonth(month));

        }
        System.out.println("Bye");
        scanner.close();
    }

}
