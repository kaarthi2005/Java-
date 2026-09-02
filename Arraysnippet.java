import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int [n];
        int arr2 [] = new int [n];
        int sum =0;
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        for(int i=n-1;i>=0;i--){
            sum -= arr[i];
            arr2[i] = sum;
        }
        for(int num : arr2){
            System.out.print(num+" ");
        }
    }
}
