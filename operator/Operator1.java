import java.util.*;

public class Operator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = a + b;
        int average = c / 2;

        if (average >= 60 && a >= 50) {
            if (b >= 50) {
                System.out.println("Pass");
            }

        } else {
            System.out.println("Fail");
        }
    }
}
