import java.util.*;

public class Nestedloop10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        

        System.out.println("\n\nPrice Comparison Matrix:\r\n" + "Product Vendor1 Vendor2 Vendor3 Vendor4 BestPrice\r\n");
        for(int i=0;i<r;i++){
            float min = Integer.MAX_VALUE;
            String str = scan.next();
            System.out.print(str);
            for(int j=0;j<c;j++){
               float num = scan.nextFloat();
                if(num < min){
                    min = num;
                }
                System.out.print(" "+num+" ");
            }
            System.out.printf(" %.2f",min);
            System.out.println();
           
        }
         scan.close();
    }
}
