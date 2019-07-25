import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //input : keyboard
        //output : Screen
        int a, b;
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        System.out.println("Input 2 numbers");
        s1 = scanner.next();
        s2 = scanner.next();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        System.out.println(a + "," + b);
        System.out.println("Sum of 2 numbers?" + (a + b));
        System.out.printf("Sum of 2 numbers? %d", a + b);
        scanner.close();
    }

}
