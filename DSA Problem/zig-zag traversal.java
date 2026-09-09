import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int arr [][] = new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int rows = arr.length;
        int cols = arr[0].length;

        for(int d=0;d<rows+cols-1;d++){
            if(d%2==0){
                int row = Math.min(d,rows-1);
                int col = d-row;
                while(row>=0 && col <cols){
                    System.out.print(arr[row][col]+" ");
                    row--;
                    col++;
                }
            }
            else{
                int col = Math.min(d,cols-1);
                int row = d-col;
                while(col>=0 && row <rows){
                    System.out.print(arr[row][col]+" ");
                    row++;
                    col--;
                }
            }
        }
    }
}
