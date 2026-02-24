import java.util.Scanner;


public class Forloop8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
          Double originalTotal = 0.00;
          int count = 0;
          Double finaltotal = 0.00;
          Double totalDiscount = 0.00;
        for(int i=0 ;i<n ;i++){
            scan.nextLine();
            String productName = scan.nextLine();
            Double price = scan.nextDouble();
            int quantity = scan.nextInt();
            int discount = 0;
            if(quantity ==1){
                discount= 0;
            }else if(quantity >=2 && quantity <=4){
                discount = 10;
            }else if(quantity >=5 && quantity <=9){
                discount = 15;
            }else if(quantity >=10){
                discount = 20;
            }

            Double mul = price*quantity*(1-discount/100.0f);
            originalTotal += (price*quantity);
            finaltotal += mul ;
            totalDiscount = originalTotal-finaltotal;
            count += quantity;

            System.out.println();
            System.out.println("Product: "+productName);
            System.out.println("Unit Price: $"+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount: "+discount+"%");
            System.out.printf("Subtotal: $%.1f",mul);
            System.out.println();
            System.out.println();
        
        }
        System.out.println("Total Items: "+count);
        System.out.printf("Original Total: $%.1f\n",originalTotal);
        System.out.printf("Total Discount: $%.2f\n",totalDiscount);
        System.out.printf("Final Total: $%.2f\n",finaltotal);
        System.out.printf("Savings: %.1f\n%",(totalDiscount/originalTotal)*100.0f);
        System.out.println();
        scan.close();
    }
}
