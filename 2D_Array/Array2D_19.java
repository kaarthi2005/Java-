import java.util.Scanner;

public class Array2D_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] arr = new int [n][n]; 
        int [][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0 ;j<n;j++){
                arr[i][j] = scan.nextInt();
                matrix[i][j] = arr[j][i];
            }
        }
        boolean count =true;
        
        for(int i=0 ;i<n;i++){
                for(int j=0 ;j<n;j++){
                if(arr[i][j] != matrix[j][i]){
                    count=false;
                    break;
                }
            }
        }
        if(count){
            System.out.println("Symmetric ");
        }else{
            System.out.println("ASymmetric ");
        }
        scan.close();
    }
}
