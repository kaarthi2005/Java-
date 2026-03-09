import java.util.Scanner;

class Array2D_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        int[][] rotated = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rotated[j][n - 1 - i] = arr[i][j];
            }
        }
        System.out.println();
        System.out.println("Rotated Matrix (90 deg clockwise):");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}