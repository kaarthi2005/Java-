import java.util.Scanner;
public class Array2D_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] seat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Seating Layout:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seat[i][j] + " ");
            }
            System.out.println();
        }
        int violations = 0;
        System.out.println();
        System.out.println("Violation Coordinates:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (seat[i][j] == 1) {
                    if (j + 1 < cols && seat[i][j + 1] == 1) {
                        System.out.println("- Seat at (" + i + ", " + j + ") is too close to (" + i + ", " + (j + 1) + ")");
                        violations++;
                    }
                    if (i + 1 < rows && seat[i + 1][j] == 1) {
                        System.out.println("- Seat at (" + i + ", " + j + ") is too close to (" + (i + 1) + ", " + j + ")");
                        violations++;
                    }
                    if (i + 1 < rows && j + 1 < cols && seat[i + 1][j + 1] == 1) {
                        System.out.println("- Seat at (" + i + ", " + j + ") is too close to (" + (i + 1) + ", " + (j + 1) + ")");
                        violations++;
                    }
                    if (i + 1 < rows && j - 1 >= 0 && seat[i + 1][j - 1] == 1) {
                        System.out.println("- Seat at (" + i + ", " + j + ") is too close to (" + (i + 1) + ", " + (j - 1) + ")");
                        violations++;
                    }

                }
            }
        }

        System.out.println("Violations Found: " + violations);

        if (violations == 0) {
            System.out.println("Status: Compliant");
        } else {
            System.out.println("Status: Non-Compliant");
        }

        sc.close();
    }
}

