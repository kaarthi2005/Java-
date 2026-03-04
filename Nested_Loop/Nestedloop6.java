import java.util.*;

public class Nestedloop6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        int [][] matrixA = new int[r][c];
        int [][] matrixB = new int[r][c];

        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c;j++){
                matrixA[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c;j++){
                matrixB[i][j] = scan.nextInt();
            }
        }

        int [][]sum = new int[r][c] ;
        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c;j++){
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Matrix A:");
        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c;j++){
               System.out.print(matrixA[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Matrix B:");
        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c;j++){
               System.out.print(matrixB[i][j] +" ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("Sum (A + B): ");
        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c;j++){
               System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


    
        


        scan.close();
    }
}