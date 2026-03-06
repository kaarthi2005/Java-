import java.util.Scanner;

public class Nestedloop17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        for(int i=0;i<r;i++){
            for(int j=0 ;j<c ;j++){
                if(i==0||i==r-1){
                    System.out.print("* ");
                }else if(j==0 || j==c-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
