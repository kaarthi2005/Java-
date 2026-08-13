import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr []= new int [n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int arr2[] = new int [n];
        arr2[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
                arr2[i] = Math.max(arr[i] ,arr2[i+1]);
        }
        int maxprofit = 0;
        for(int i=0;i<n;i++){
            int curprofit = arr2[i]-arr[i];
            if(curprofit>maxprofit){
                maxprofit = curprofit;
            }
        }
        System.out.print(maxprofit);
    }
}
