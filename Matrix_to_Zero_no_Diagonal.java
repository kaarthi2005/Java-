import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [][] = new int [n][n];
        boolean valid = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
                int val = arr[i][j];
                if(i==0 || i == n-1 || i+j == n-1){
                    if(val == 0){
                        valid = false;
                        break;
                    }
                }else{
                    if(val != 0){
                        valid = false;
                        break;
                    }
                }
            }
        }
        
        System.out.print(valid);
    }
}
