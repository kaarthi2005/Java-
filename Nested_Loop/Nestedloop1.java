import java.util.Scanner;

public class Nestedloop1{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        for(int i=1 ;i<=c ;i++){
            System.out.print(i+" ");
        }
        System.out.println();
         for(int i =1 ;i<=r ;i++){
            System.out.print(i+" ");
            for(int j =1 ;j<=c ;j++){
               System.out.print(i*j+" ");        
            }
            System.out.println();
         }
         scan.close();
    }
}
