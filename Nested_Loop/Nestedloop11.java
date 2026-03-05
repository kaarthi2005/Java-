import java.util.Scanner;

public class Nestedloop11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0;
        for(int i=0 ;i<n;i++){
            for(int j=0 ;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0 ;k<i+1 ;k++){
                if(k==0){
                    c=1;
                }else{
                    c = c*(i-k+1)/k;
                }
                System.out.print(c+" ");
            }
            System.out.println();
        }
       scan.close();
    }
}