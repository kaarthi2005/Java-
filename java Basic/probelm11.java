import java.util.Scanner;

public class probelm11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a distance: ");
        int distance = scan.nextInt();
        System.out.println("Enter a rate: ");

        int rate = scan.nextInt();
        System.out.println("Enter a maintanance: ");

        int maintaincharge = scan.nextInt();
        System.out.println("Enter a allowance: ");

        int allowance = scan.nextInt();
        System.out.println("Enter a subsidy: ");

        int subsidy = scan.nextInt();

        int total = (distance* rate) + maintaincharge+ allowance - subsidy;

        System.err.println(total);
    }
}
