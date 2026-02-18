import java.util.Scanner;

public class Conditonal11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String orderType = scan.nextLine();
        String loyaltyStatus = scan.nextLine();
        float orderValue = scan.nextFloat();
        scan.nextLine();
        String timeSlot = scan.nextLine();


        int baseDiscount = 0 ;
        if(loyaltyStatus.equals("Gold")){
           baseDiscount = 15 ;
        }else  if(loyaltyStatus.equals("Silver")){
            baseDiscount = 10 ;
        }else  if(loyaltyStatus.equals("Bronze")){
            baseDiscount = 5 ;
        }else{
             baseDiscount = 0 ;
        }

        int timeBasedAdjustment = 0;
        if(timeSlot.equals("Peak")){
           timeBasedAdjustment = 0 ;
        }else  if(timeSlot.equals("Regular")){
            timeBasedAdjustment = 0 ;
        }else  if(timeSlot.equals("Late-Night")){
            timeBasedAdjustment = -5 ;
        }

        float serviceFee =0 ;
         if(orderType.equals("Delivery")){
           serviceFee = 10 ;
        }else  if(orderType.equals("Takeout")){
            serviceFee = 3;
        }else  if(orderType.equals("Dine-In")){
            serviceFee = 0 ;
        }

        String kitchen = null;
        if(timeSlot.equals("Peak")&&orderType.equals("Delivery")){
            kitchen ="High";
        }else  if(timeSlot.equals("Regular")){
             kitchen ="Medium";
        }else if(timeSlot.equals("Late-Night")){
             kitchen ="Low";
        }

        int total_Discount = timeBasedAdjustment + baseDiscount;
        float discountedValue =(orderValue*total_Discount) /100;
       
        float total_servicefee = (orderValue*serviceFee)/100;
        
        float finalAmount = (orderValue+total_servicefee)-discountedValue;

        System.out.println("Order Type: "+orderType);
        System.out.println("Loyalty Status: "+loyaltyStatus);
        System.out.println("Order Value: $"+orderValue);
        System.out.println("Time Slot: "+timeSlot);
        System.out.println("Base Discount: "+baseDiscount+" %");
        System.out.println("Time-Based Adjustment: "+timeBasedAdjustment+"%");
        System.out.println("Service Fee: $"+serviceFee);
        System.out.println("Final Amount: $"+finalAmount);
        System.out.println("Kitchen Priority: "+kitchen);
        int time =0;
        if(kitchen.equals("High")){
            time = 25;
        }else if(kitchen.equals("Medium")){
            time = 20;
        }else if(kitchen.equals("Low")){
            time = 15;
        }

        System.out.println("Estimated Prep Time: "+time+" minutes");








        scan.close();
    }
}
