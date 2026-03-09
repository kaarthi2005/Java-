import java.util.Scanner;

public class Array2D_12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n2 = scan.nextInt();

        int rainfall[][] = new int[n][n2];
        int weeklyTotal[] = new int[n];
        int monthlyTotal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                rainfall[i][j] = scan.nextInt();
            }
        }
        System.out.println("Rainfall Data:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(rainfall[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                weeklyTotal[i] += rainfall[i][j];
            }
            monthlyTotal += weeklyTotal[i];
        }
        int min = weeklyTotal[0];
        int week = 0;

        for (int i = 1; i < n; i++) {
            if (weeklyTotal[i] < min) {
                min = weeklyTotal[i];
                week = i;
            }
        }
        System.out.println("Weekly Totals:");
        for (int i = 0; i < n; i++) {
            System.out.println("Week " + (i + 1) + ": " + weeklyTotal[i] + " mm");
        }
        System.out.println("Monthly Total: " + monthlyTotal + " mm");
        System.out.println("Driest Week: Week " + (week + 1) + " (" + min + " mm)");

        scan.close();
    }
}

