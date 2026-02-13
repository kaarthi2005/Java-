import java.util.Scanner;

public class probelm19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total num of days: ");
        int day = scan.nextInt();
        System.out.println("Enter a amount of rent: ");

        int rent = scan.nextInt();
        System.out.println("Enter a amount of latefee : ");

        int latefee = scan.nextInt();
        System.out.println("Enter a amount of fuel: ");

        int feulcost= scan.nextInt();
        System.out.println("Enter a amount of maintenance: ");

       
        int maintainance= scan.nextInt();

        int total =(day*rent)+latefee-feulcost-maintainance;

        System.out.println(total);
    }
}

