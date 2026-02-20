import java.util.Scanner;

public class Conditonal19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieFormat  = scan.nextLine();
        String showTime = scan.nextLine();
        String seatCategory  = scan.nextLine();
        String customerType   = scan.nextLine();

        float  baseticketprice = 12.0f;
        float formatsurcharge = 0 ;
        String PricingCategory = null;
        if(movieFormat.equals("2D")){
                formatsurcharge = 0.0f;
                PricingCategory = "Standard";
        }else if(movieFormat.equals("3D")){
                 formatsurcharge = 5.0f;
                 PricingCategory = "Value";
        }else if(movieFormat.equals("IMAX")){
                 formatsurcharge = 8.0f;
                 PricingCategory = "Luxury";
        }else if(movieFormat.equals("4DX")){
                 formatsurcharge = 10.0f;
                  PricingCategory = "Premium";
        } 


        float seatupgrade = 0;
        if(seatCategory.equals("2D")){
                seatupgrade = 0.0f;
        }else if(seatCategory.equals("3D")){
                 seatupgrade = 4.0f;
        }else if(seatCategory.equals("IMAX")){
                 seatupgrade = 7.0f;
        }

        String concessionvoucher = "No";
        int timeBased = 0;
         if(showTime.equals("Matinee")){
                timeBased = -30;
                concessionvoucher ="Yes";
        }else if(showTime.equals("Evening")){
                 timeBased = 0;
        }else if(showTime.equals("Prime-Time")){
                 timeBased = 20;
        }else if(showTime.equals("Late-Night")){
                 timeBased = -20;
        }

        int customerdiscount = 0;
          if(customerType.equals("Adult")){
                customerdiscount = 0;
        }else if(customerType.equals("Senior")){
                 customerdiscount = 20;
                  concessionvoucher ="Yes";
        }else if(customerType.equals("Student")){
                 customerdiscount = 15;
                  concessionvoucher ="Yes";
        }else if(customerType.equals("Child")){
                 customerdiscount = 30;
                  concessionvoucher ="Yes";
        }

        float baseWithSurcharges = baseticketprice+formatsurcharge+seatupgrade;
        float adjustedPrice = baseWithSurcharges*(1+timeBased/100.0f);
        float finalPrice = adjustedPrice*(1-customerdiscount/100.0f);

       
        
        System.out.println("Movie Format: "+movieFormat);
        System.out.println("Show Time: "+showTime);
        System.out.println("Seat Category: "+seatCategory);
        System.out.println("Customer Type: "+customerType);
        System.out.println("Base Ticket Price: $"+baseticketprice);
        System.out.println("Format Surcharge: $"+formatsurcharge);
        System.out.println("Seat Upgrade Fee: $"+seatupgrade);
        System.out.println("Time-Based Adjustment: "+timeBased+"%");
        System.out.println("Customer Discount: "+customerdiscount);
        System.out.println("Final Ticket Price: $"+finalPrice);
        System.out.println("Concession Voucher: "+concessionvoucher);
        System.out.println("Pricing Category: "+PricingCategory);
        

        scan.close();
    }
}
