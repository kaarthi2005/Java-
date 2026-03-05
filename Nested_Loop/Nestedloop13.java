import java.util.Scanner;

public class Nestedloop13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mC = 0,mR = 0,MR=n-1, MC = n-1;
        int [][] matrix = new int [n][n];





        int i=1;
        while(i<=(n*n)){
            for(int j=mC ;j <= MC ;j++){
                matrix[mR][j] = i++;
            }
            for(int j=mR+1 ;j <= MR ;j++){
                matrix[j][MC] = i++;
            }
            for(int j=MC-1 ;j >= mC ;j--){
                matrix[MR][j] = i++;
            }
            for(int j=MR-1 ;j >= mR+1 ;j--){
                matrix[j][mC] = i++;
            }

            mC++;
            mR++;
            MR--;
            MC--;
        }
        

        for(int k=0 ;k<n;k++){
            
            for(int j =0;j<n;j++){
             
               System.out.print(matrix[k][j]+" ");
               
            }
            System.out.println();
        }
        scan.close();
       }
}
