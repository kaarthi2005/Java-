import java.util.Scanner;

public class probelm21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total amount of maintatence: ");
        int maintanince = scan.nextInt();
        System.out.println("Enter a collection in parking: ");

        int parking = scan.nextInt();
        System.out.println("Enter a amount of hallrent : ");

        int hallrent = scan.nextInt();
        System.out.println("Enter a amount of security: ");

        int security= scan.nextInt();

        System.out.println("Enter a total amount of electricity");
        int electricity = scan.nextInt();

        System.out.println("Enter a total amount of cleaning charge");
        int cleaning = scan.nextInt();

        int total = maintanince+parking+hallrent-security-electricity-cleaning;

        System.out.println(total);
    }
}

