import java.util.Scanner;

public class Nestedloop20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        int [][] arr = new int[r][c];
        int [][]arr1 = new int[c][r];
        
        
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                arr[i][j] = scan.nextInt();
                arr1[j][i] = arr[i][j]; 
            }
        }

        System.out.println("Original Matrix ("+r+" x "+c+"):");

        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed Matrix ("+c+" x "+r+"):");
        for(int i=0;i<c ;i++){
            for(int j=0 ;j<r ;j++){
               System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }

}
