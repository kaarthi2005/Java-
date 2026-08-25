import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        long arr [][] = new long [n1][n2];
        
        List <Long> list = new ArrayList<>();
        long a = 0;
        long b = 1;
        
        for(int i=0;i<n1*n2;i++){
            list.add(a);
            long c = a+b;
            a = b;
            b = c;
        }
        
        int i=0;
        int mr = 0,mc = 0,MR = n1-1,MC = n2-1;
        while(mr<= MR && mc <= MC){
            for(int j=mc;j<=MC;j++){
                arr[mr][j] = list.get(i++);
            }
            mr++;
            for(int j=mr;j<=MR;j++){
                arr[j][MC] = list.get(i++);
            }
            MC--;
            if(mr<=MR){
            for(int j=MC;j>=mc;j--){
                arr[MR][j] = list.get(i++);
            }
            MR--;
            }
            if(mc<=MC){
            for(int j=MR;j>=mr;j--){
                arr[j][mc] = list.get(i++);
            }
            mc++;
            }
           
        }
        for(int j=0;j<n1;j++){
            for(int k=0;k<n2;k++){
                System.out.print(arr[j][k]+" ");
            }System.out.println();
        }
    }
}
