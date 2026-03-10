import java.util.Scanner;

public class Array2D_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] arr = new int [n][];
        int  count = 0;
        for(int i=0 ;i<n;i++){
            int x = scan.nextInt();
            arr[i] = new int[x];
            for(int j=0 ;j<x ;j++){
                arr[i][j] = scan.nextInt();
                count++;
            }
        }
        for(int i=0 ;i<n ;i++){
             System.out.print("Dept "+(i+1)+" : ");
            for(int j=0 ;j<arr[i].length;j++){
               System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Employees: "+count);
        

        scan.close();
    }
}
