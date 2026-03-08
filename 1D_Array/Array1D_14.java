import java.util.Scanner;

public class Array1D_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] yield = new double[n];
        for (int i = 0; i < n; i++) {
            yield[i] = scan.nextDouble();
        }
        double total = 0;
        double max = yield[0];
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            total += yield[i];

            if (yield[i] > max) {
                max = yield[i];
                maxIndex = i;
            }
        }
        double average = total / n;
        double threshold = average * 0.8;
        int underperform = 0;
        for (int i = 0; i < n; i++) {
            if (yield[i] < threshold) {
                underperform++;
            }
        }
        System.out.println("Total Plots: " + n);
        System.out.printf("Total Harvest: %.2f tons\n", total);
        System.out.printf("Average Yield: %.2f tons/acre\n", average);
        System.out.printf("Highest Yield: %.2f tons/acre (Plot %d)\n", max, maxIndex + 1);
        System.out.println("Underperforming Plots: " + underperform);
        System.out.printf("Performance Threshold: %.2f tons/acre\n", threshold);

        scan.close();
    }
}