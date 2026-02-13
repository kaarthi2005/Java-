
import java.util.Scanner;

public class probelm17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a hour: ");
        int hour = scan.nextInt();
        System.out.println("Enter a rate: ");

        int rate = scan.nextInt();
        System.out.println("Enter a design amount: ");

        int design_amount = scan.nextInt();
        System.out.println("Enter a testing: ");

        int testing= scan.nextInt();
        System.out.println("Enter a advance: ");

        int advance = scan.nextInt();

        int total = (hour*rate)+design_amount+testing-advance;

        System.out.println(total);
    }
}

