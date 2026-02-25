import java.util.Scanner;

public class Forloop10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float totsubtotal = 0;
        Double  subtotal = 0.0;
       int count =0 ;
        for(int i =0 ;i<n ;i++){
            count++;
            scan.nextLine();
            String itemName = scan.nextLine();
            Double price  = scan.nextDouble();
            int quantity = scan.nextInt();
            subtotal = price*quantity;
            totsubtotal += subtotal;
            System.out.println();
            System.out.println();
            System.out.println("Item: "+itemName);
            System.out.printf("Price: $%.1f x %d\n",price,quantity);
            System.out.printf("Subtotal: $%.1f\n",subtotal);
            System.out.println();
            System.out.println();



        }
        float tax = totsubtotal*0.08f;
        float serviceCharge = totsubtotal*0.10f;
        float tot = (totsubtotal + tax + serviceCharge);
        System.out.println("Total Items: "+count);
        System.out.printf("Subtotal: $%.1f\n",totsubtotal);
        System.out.printf("Tax (8%%): $%.1f\n",tax);
        System.out.printf("Service Charge (10%%): $%.1f\n",serviceCharge);
        System.out.printf("Grand Total: $%.1f\n",tot);
        scan.close();
    }
}
