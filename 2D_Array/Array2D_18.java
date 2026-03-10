import java.util.*;
public class Array2D_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mc = 0,mr=0,MC = n-1,MR =n-1;
        int i=1;
        int [][] arr = new int [n][n]; 
        while (i<=(n*n)) {
            for(int j=mc ;j<=MC;j++){
                arr[mr][j] = i++;
            }
            for(int j=mr+1;j<=MR;j++){
                arr[j][MC] = i++;
            }
            for(int j=MC-1;j>=mc;j--){
                arr[MR][j] = i++;
            }
            for(int j=MR-1;j>=mr+1;j--){
                arr[j][mc] = i++;
            }
            mc++;
            mr++;
            MC--;
            MR--;
        }

        for(int k=0 ;k<n;k++){
            for(int j=0;j<n;j++){
                System.out.print(arr[k][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        scan.close();
    }
}
