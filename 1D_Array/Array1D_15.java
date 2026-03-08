import java.util.Scanner;

public class Array1D_15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] calls = new int[n];

        for (int i = 0; i < n; i++) {
            calls[i] = scan.nextInt();
        }

        int sum = 0;
        int min = calls[0];
        int max = calls[0];
        int exceed = 0;

        for (int i = 0; i < n; i++) {
            sum += calls[i];

            if (calls[i] < min) {
                min = calls[i];
            }
            if (calls[i] > max) {
                max = calls[i];
            }
            if (calls[i] > 300) {
                exceed++;
            }
        }
        double average = (double) sum / n;
        double compliance = ((double) (n - exceed) / n) * 100;
        System.out.println("Total Calls: " + n);
        System.out.printf("Average Handling Time: %.2f seconds\n", average);
        System.out.println("Shortest Call: " + min + " seconds");
        System.out.println("Longest Call: " + max + " seconds");
        System.out.println("Calls Exceeding Target (300s): " + exceed);
        System.out.printf("Target Compliance: %.2f%%\n", compliance);

        scan.close();
    }
}