import java.util.*;
public class Nestedloop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int j=1;

        System.out.println("Calendar Grid:\n"+"Mon   Tue   Wed   Thu   Fri   Sat   Sun");
        for(int i=1 ;i<=6;i++){
            int count =0;
            for( ;j<=a ;){
                count++;
                
                if(b-1 >0){
                    System.out.print("      ");
                }
                else {
                    System.out.print("  "+j+"  ");
                    j++;
                }b--;

                if(count == 7){
                    break;
                }

            }
            System.out.println();

            if(j==a+1){
                break;
            }
        }

        scan.close();

    }
}