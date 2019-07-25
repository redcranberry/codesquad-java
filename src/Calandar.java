import java.util.Scanner;

public class Calandar {

    public static void main(String[] args) {
        //Put numbers then will printout the selected months largest day
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month number");
        int month = scanner.nextInt();

        int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.printf("%d month has %dday\n", month, maxDays[month - 1]);
        scanner.close();
    }
}
