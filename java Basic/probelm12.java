import java.util.Scanner;

public class probelm12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total amount of ticket revenue: ");
        int ticket_revenue = scan.nextInt();
         System.out.println("Enter a total amount of Snack revenue: ");
        int snack_revenue = scan.nextInt();
         System.out.println("Enter a total amount of maintainance: ");
        int maintanance = scan.nextInt();
         System.out.println("Enter a total amount of electicity bill: ");
        int electricity = scan.nextInt();

        int total = ticket_revenue+snack_revenue-maintanance-electricity;
        System.out.println(total);
    }
}
