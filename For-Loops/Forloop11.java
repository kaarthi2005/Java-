import java.util.*;

public class Forloop11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        float originalTotal = 0;
        float totalfinal= 0;
        int k = 0;
        int groupdiscount = 10;
        for(int i=0;i<n ;i++){
            count++;
            scan.nextLine();
            String seatType = scan.nextLine();
            String customerType = scan.nextLine();

            float baseprices =0;
            if(seatType.equals("Regular")){
                baseprices = 12.0f;
            }else if(seatType.equals("Premium")){
                baseprices = 18.0f;
            }else if(seatType.equals("Recliner")){
                baseprices = 25.0f;
            } 

            int discounts = 0;
            if(customerType.equals("Adult")){
                discounts = 0;
            }else if(customerType.equals("Child")){
                discounts = 30;
            }else if(customerType.equals("Senior")){
                discounts = 25;
            }

            originalTotal += baseprices;
            float finalPrice = baseprices*(1-discounts/100.0f);
            totalfinal += finalPrice;
            if(n>=5){
                k=1;
            }

            System.out.println();
            
            System.out.println("Ticket "+count+" : "+seatType+"-"+customerType);
            System.out.println("Base Price: $"+baseprices);
            System.out.println("Discount: "+discounts+"%");
            System.out.println("Final Price: $"+finalPrice);
            System.out.println();
            System.out.println();


        }
        System.out.println("Total Tickets: "+count);
        System.out.println("Original Total: $"+originalTotal);
        System.out.println("Total Discount: "+(originalTotal-totalfinal));
        if(k==1){
            float finalTotal = totalfinal*(groupdiscount/100.0f);
            System.out.println("Final Total: $"+finalTotal);
            System.out.println("Group Discount Applied: Yes");
        }
        else{
            System.out.println("Final Total: $"+totalfinal);
            System.out.println("Group Discount Applied: No");
        }
    }
}
