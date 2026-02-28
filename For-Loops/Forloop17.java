import java.util.Scanner;

public class Forloop17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int urgentCount = 0;
        double totalRevenue = 0.0;

        for (int i = 0; i < n; i++) {

            String memberName = scan.next();
            String membershipType = scan.next();
            int daysUntilExpiry = scan.nextInt();

            double renewalFee = 0.0;

            if (membershipType.equals("Basic")) {
                renewalFee = 50.0;
            } 
            else if (membershipType.equals("Premium")) {
                renewalFee = 100.0;
            } 
            else if (membershipType.equals("VIP")) {
                renewalFee = 200.0;
            }

            int discount = 0;

            if (daysUntilExpiry >= 45) {
                discount = 20;
            } 
            else if (daysUntilExpiry >= 30) {
                discount = 15;
            } 
            else if (daysUntilExpiry >= 15) {
                discount = 10;
            } 
            else {
                discount = 0;
            }

            double finalFee = renewalFee * (1 - discount / 100.0);

            String priority;

            if (daysUntilExpiry < 10) {
                priority = "Urgent";
                urgentCount++;
            } 
            else if (daysUntilExpiry <= 30) {
                priority = "High";
            } 
            else {
                priority = "Normal";
            }

            totalRevenue += finalFee;

            System.out.println("Member: " + memberName);
            System.out.println("Membership: " + membershipType);
            System.out.println("Days Until Expiry: " + daysUntilExpiry);
            System.out.println("Renewal Fee: $" + renewalFee);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Fee: $" + finalFee);
            System.out.println("Priority: " + priority);
            System.out.println();
        }

        double averageFee = totalRevenue / n;

        System.out.println("Total Members: " + n);
        System.out.println("Urgent Renewals: " + urgentCount);
        System.out.println("Total Renewal Revenue: $" + totalRevenue);
        System.out.println("Average Renewal Fee: $" + averageFee);

        scan.close();
    }
}