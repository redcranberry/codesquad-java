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
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        System.out.println("Input repeat number");
        int repeat = scanner.nextInt();

        for (int i = 0; i < repeat; i++) {
            System.out.println("Input month");
            int month = scanner.nextInt();
            System.out.printf("%d month has %dday\n", month, cal.getMaxDaysOfMonth(month));

        }
        System.out.println("Bye");
        scanner.close();
    }

}
