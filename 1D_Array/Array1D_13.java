import java.util.Scanner;

public class Array1D_13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] delay = new int[n];

        for (int i = 0; i < n; i++) {
            delay[i] = scan.nextInt();
        }

        int sum = 0;
        int max = delay[0];
        int onTime = 0;
        int compensation = 0;

        for (int i = 0; i < n; i++) {
            sum += delay[i];

            if (delay[i] > max) {
                max = delay[i];
            }

            if (delay[i] <= 15) {
                onTime++;
            }

            if (delay[i] > 180) {
                compensation++;
            }
        }

        double average = (double) sum / n;
        double performance = ((double) onTime / n) * 100;

        System.out.println("Total Flights: " + n);
        System.out.printf("Average Delay: %.2f minutes\n", average);
        System.out.println("Maximum Delay: " + max + " minutes");
        System.out.println("On-Time Flights: " + onTime);
        System.out.println("Compensation Required: " + compensation);
        System.out.printf("On-Time Performance: %.2f%%\n", performance);

        scan.close();
    }
}
