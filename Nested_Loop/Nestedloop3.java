import java.util.*;
public class Nestedloop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        if(str.equals("number")){
            System.out.println("Right Triangle Pattern: ");
            for(int i=1 ;i<=n ;i++){
                for(int j=1 ;j<=i ;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }else if(str.equals("star")){
             System.out.println("Right Triangle Pattern: ");
             for(int i=1 ;i<=n ;i++){
                for(int j=1 ;j<=i ;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }



        scan.close();
    }
}
