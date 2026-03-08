
import java.util.Scanner;

public class Array1D_12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextDouble();
        }

        double dailyLimit = scan.nextDouble();

        double total = 0;
        double max = arr[0];
        int peakHour = 0;

        for (int i = 0; i < n; i++) {
            total += arr[i];

            if (arr[i] > max) {
                max = arr[i];
                peakHour = i;
            }
        }

        double average = total / n;

        System.out.println("Hours Monitored: " + n);
        System.out.printf("Total Daily Consumption: %.2f kWh\n", total);
        System.out.printf("Peak Hour: Hour %d (%.2f kWh)\n", peakHour + 1, max);
        System.out.printf("Average Hourly: %.2f kWh\n", average);
        System.out.printf("Daily Limit: %.2f kWh\n", dailyLimit);

        if (total <= dailyLimit) {
            System.out.println("Status: Within Limit");
        } else {
            double diff = total - dailyLimit;
            System.out.printf("Status: Exceeded by %.2f kWh\n", diff);
        }

        scan.close();
    }
}
