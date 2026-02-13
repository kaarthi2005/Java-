import java.util.Scanner;

public class probelm9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Roomcharge: ");
        int roomcharge = scan.nextInt();
        System.out.println("Enter a day: ");

        int day = scan.nextInt();
        System.out.println("Enter a medicalcost: ");

        int medicost = scan.nextInt();
        System.out.println("Enter a labfees: ");

        int labfees = scan.nextInt();
        System.out.println("Enter a insurancecoverage: ");

        int insurance = scan.nextInt();

        int total = (roomcharge * day) + medicost + labfees - insurance;

        System.err.println(total);
    }
}
