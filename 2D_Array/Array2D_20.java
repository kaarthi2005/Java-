import java.util.Scanner;

public class Array2D_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int [n][n];
        int c=0;
        for(int i=0 ;i<n;i++){
            for(int j=0 ;j<n ;j++){
                if(j==0){
                    arr[i][j] = 1;
                    continue;
                }
               c= c*(i+1-j)/j;
               arr[i][j] = c;
            }
        }

        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
