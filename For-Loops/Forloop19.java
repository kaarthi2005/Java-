import java.util.Scanner;

public class Forloop19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int activeCount = 0;
        int expiringSoonCount = 0;
        int expiredCount = 0;

        for (int i = 0; i < n; i++) {
            String productID = scan.next();
            String productType = scan.next();
            int monthsUsed = scan.nextInt();
            int warrantyPeriod = 0;
            if (productType.equals("Electronics")) {
                warrantyPeriod = 12;
            } else if (productType.equals("Appliance")) {
                warrantyPeriod = 24;
            } else if (productType.equals("Computer")) {
                warrantyPeriod = 36;
            }
            int remaining = warrantyPeriod - monthsUsed;
            if (remaining < 0) {
                remaining = 0;
            }
            String status = null;
            if (remaining == 0) {
                status = "Expired";
                expiredCount++;
            } else if (remaining >= 1 && remaining <= 3) {
                status = "Expiring Soon";
                expiringSoonCount++;
            } else {
                status = "Active";
                activeCount++;
            }
            System.out.println("Product ID: " + productID);
            System.out.println("Type: " + productType);
            System.out.println("Warranty Period: " + warrantyPeriod + " months");
            System.out.println("Months Used: " + monthsUsed);
            System.out.println("Remaining: " + remaining + " months");
            System.out.println("Status: " + status);
            System.out.println();
        }
        System.out.println("Total Products: " + n);
        System.out.println("Active Warranties: " + activeCount);
        System.out.println("Expiring Soon: " + expiringSoonCount);
        System.out.println("Expired Warranties: " + expiredCount);
        scan.close();
        
    }
}