import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int space = n-1;
        for(int i=1 ;i<=n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            space--;
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
