import java.util.Scanner;

public class Array1D_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int riskScores[] = new int[n];
        int total = 0;
        int max = 0;
        int min = 100;
        int maxIndex = 1;
        int minIndex = 1;
        for (int i = 0; i < n; i++) {
            riskScores[i] = scan.nextInt();
            total += riskScores[i];
            if (riskScores[i] > max) {
                max = riskScores[i];
                maxIndex = i + 1; 
            }
            if (riskScores[i] < min) {
                min = riskScores[i];
                minIndex = i + 1;
            }
        }
        double average = (double) total / n;
        double threshold = average * 2.0;
        int alertEvents[] = new int[n];
        int criticalCount = 0;
        for (int i = 0; i < n; i++) {
            if (riskScores[i] > threshold) {
                alertEvents[criticalCount] = i + 1; 
                criticalCount++;
            }
        }
        System.out.println("Security Events Analyzed: " + n);
        System.out.printf("Average Risk Score: %.2f\n", average);
        System.out.println("Highest Risk Event: " + max + " (Event " + maxIndex + ")");
        System.out.println("Lowest Risk Event: " + min + " (Event " + minIndex + ")");
        System.out.println("Critical Threats (>200% avg): " + criticalCount);
        System.out.printf("Threat Threshold: %.2f\n", threshold);
        System.out.print("Alert Events: [");
        for (int i = 0; i < criticalCount; i++) {
            System.out.print(alertEvents[i]);
            if (i != criticalCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


        scan.close();
    }
}