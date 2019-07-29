import java.util.Scanner;

public class Prompt {

    private final static String PROMPT = "cal> ";

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = 1;
        int year = 1;
        //Error occurred because 'cal.getMaxDaysOfMonth is executed at least 1 time
        while (true) {
            System.out.println("Input year");
            System.out.println("YEAR> ");
            year = scanner.nextInt();
            System.out.println("Input month");
            System.out.println("MONTH> ");
            month = scanner.nextInt();
            System.out.println("Input first day of week");
            if (month < 1) {
                break;
            }
            if (month > 12) {
                continue;
            }
            cal.printCalendar(year, month);
        }
        System.out.println("Bye");
        scanner.close();
    }

    public static void main(String[] args) {
        //run
        Prompt p = new Prompt();
        p.runPrompt();

    }

}
