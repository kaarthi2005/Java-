import java.util.Scanner;

public class Array2D_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int a = (r<c? c :r);
        int [][]arr = new int [a][a] ;
        int [][] arr1 = new int [a][a];
        int [][] arr2 = new int [a][a];

        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c ;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c ;j++){
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matrix 1: ");

        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix 2: ");
        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Sum matrix: ");
        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c ;j++){
                arr2[i][j] = arr[i][j] + arr1[i][j];
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }


        scan.close();


    }
}
