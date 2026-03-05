import java.util.Scanner;

public class Nestedloop9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 0;
        int middle = n/2;
        for(int i = 0 ;i<n ;i++){
            int l=1;
            String flag = "true";
            for(int j=0 ;j<= middle-i+1 ;j++){
                System.out.print(" ");
            }
            for(int k=0 ;k< (m = 2*i+1) ;k++){
                if(l>m/2 || flag.equals("false")){
                    flag = "false";
                    System.out.print(l);
                    l--;
                }else if (flag.equals("true")){
                    System.out.print(l);
                    l++;
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
