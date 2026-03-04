import java.util.Scanner;

public class Nestedloop7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int middle = n/2;
        for(int i = 0 ;i<= middle ;i++){
            for(int j=0 ;j< middle-i ;j++){
                System.out.print(" ");
            }
            for(int k=0 ;k< (2*i+1) ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i = middle-1 ;i>=0 ;i--){
            for(int j=0 ;j< middle-i ;j++){
                System.out.print(" ");
            }
            for(int k=0 ;k< (2*i+1) ;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}
