import java.util.*;

public class Forloop14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double totalFines = 0.0;
        int overdueCount = 0;

        for (int i = 1; i <= N; i++) {
            String bookType = scan.next();
            int daysLate = scan.nextInt();

            double dailyFine = 0.0;
            double maxCap = 0.0;
            if (bookType.equals("Regular")) {
                dailyFine = 0.5;
                maxCap = 10.0;
            } else if (bookType.equals("Reference")) {
                dailyFine = 1.0;
                maxCap = 20.0;
            } else if (bookType.equals("Magazine")) {
                dailyFine = 0.25;
                maxCap = 5.0;
            }

            double calculatedFine = daysLate * dailyFine;
            double actualFine = calculatedFine;
            int capApplied = 0;
            if (calculatedFine > maxCap) {
                actualFine = maxCap;
                capApplied = 1;
            }
            if (daysLate > 0) {
                overdueCount++;
            }
            totalFines += actualFine;

            System.out.println("Book " + i + ": " + bookType);
            System.out.println("Days Late: " + daysLate);
            System.out.println("Daily Fine: $" + dailyFine);
            System.out.println("Calculated Fine: $" + calculatedFine);
            System.out.println("Actual Fine: $" + actualFine);
            System.out.println("Cap Applied: " + (capApplied == 1 ? "Yes" : "No"));
            System.out.println();
        }

        double averageFine = (N > 0) ? totalFines / N : 0.0;

        System.out.println("Total Books: " + N);
        System.out.println("Total Fines Collected: $" + totalFines);
        System.out.println("Books Overdue: " + overdueCount);
        System.out.printf("Average Fine: $%.2f", averageFine);

        scan.close();
    }
}