import java.util.Scanner;

public class Array2D_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        int [][] arr = new int [r][c];
        int [] arr1 = new int[r] ;
        int sum;
        for(int i=0 ;i<r ;i++){
            sum = 0;
            for(int j=0 ;j<c ;j++){
                arr[i][j] = scan.nextInt();
                sum+=arr[i][j];
            }
            arr1[i] = sum;
        }
        int max = 1;
        int colsum ;
        int index = -1;
        for(int i=0 ;i<c;i++){
            colsum = 0;
            for(int j=0 ;j<r;j++){
                colsum += arr[j][i];
            }
            if(max <= colsum || max ==1){
                max = colsum;
                index = i+1;
            }
        }

        System.out.println();
        System.out.println("Traffic Data: ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Total Traffic Per Lane: ");
        for(int i=0 ;i<r ;i++){
            System.out.println("Lane "+(i+1)+" "+arr1[i]);
        }
        System.out.println("Busiest Hour: Hour "+index+" with "+max+" Vechiles");
        System.out.println();
        scan.close();
    } 
}
