import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr [] = new long [n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextLong();
        }
        long target = scan.nextLong();
        for(int i=0;i<n;i++){
            if(arr[i] != target){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
