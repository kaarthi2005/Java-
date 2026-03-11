import java.util.Scanner;

public class Array2D_21{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num[] = new int[n];
        int answer []= new int [n];

        for(int i=0 ;i<n ;i++){
            num[i] = scan.nextInt();
        }
        answer[0] = 1;
        for(int i=1 ;i<n ;i++){
            answer[i] = answer[i-1] * num[i-1];
        }
        int suffix = 1;
        for(int i=n-1 ;i>=0 ;i--){
            answer[i] = answer[i]*suffix;
            suffix = suffix*num[i];
        }
        for(int i=0 ;i<n ;i++){
            System.out.print(answer[i]+" ");
        }
        scan.close();
    }
}