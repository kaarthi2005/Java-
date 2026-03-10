import java.util.Scanner;

public class Array2D_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = (n*2)-1;
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<r;j++){
                int top = i;
                int left = j;
                int right = (r-1)-j;
                int bottom = (r-1)-i;
                int max = top;
                if(left<max){
                    max = left;
                }
                if(right<max){
                    max = right;
                }
                 if(bottom<max){
                    max = bottom;
                }
                System.out.print(n-max+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
