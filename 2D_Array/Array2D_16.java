import java.util.Scanner;

public class Array2D_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] arr = new int [n][];
       
        for(int i=0 ;i<n ;i++){
            int x = scan.nextInt();
            arr[i] = new int [x];
            for(int j=0 ;j<x ;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int [] arr1 = new int [n] ;
        int max = 1;
        int index =-1;
        System.out.println();
        System.out.println();
        for(int i=0 ;i<n ;i++){
            int sum =0 ;
            System.out.print("Floor  "+(i+1)+" : ");
            for(int j=0 ;j<arr[i].length;j++){
                 System.out.print(arr[i][j] +" ");
                 if(arr[i][j] ==1){
                    sum+=1;
                 }
                 arr1[i] = sum;
                 if(max<sum||max==1){
                    max = sum;
                    index = i+1;
                 }
            }
            System.out.println();
        }


        System.out.println("Occupancy Report: ");
        for(int i=0 ;i<n ;i++){
            System.out.print("Floor  "+(i+1)+" : ");
            for(int j=0 ;j<1;j++){
                System.out.print(arr1[i]+" occupied");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Busiest Floor: Floor "+index+"("+max+" rooms occupied)");

        scan.close();
    }
}
