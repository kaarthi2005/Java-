import java.util.Scanner;

public class Nestedloop19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = 0;
        for(int i=0 ;i<n ;i++){
            for(int k=0 ;k< i+1;k++){
                h++;
                System.out.print(h+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
