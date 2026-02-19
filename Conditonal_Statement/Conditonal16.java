import java.util.Scanner;

public class Conditonal16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String roomCategory = scan.nextLine();
        String season = scan.nextLine();
        int nightsBooked = scan.nextInt();
        scan.nextLine();
        String loyaltyTier = scan.nextLine();



        float perNight = 0;
        if(roomCategory.equals("Standard")){
            perNight = 150;
        }else if(roomCategory.equals("Deluxe")){
             perNight = 300;
        }else if(roomCategory.equals("Suite")){
             perNight = 500;
        }else if(roomCategory.equals("Presidential")){
             perNight = 1000;
        }

        float seasonalmultiplier = 0;
        if(season.equals("Off-Peak")){
            seasonalmultiplier = 0.7f;
        }else if(season.equals("Regular")){
              seasonalmultiplier = 1.0f;
        }else if(season.equals("Peak")){
              seasonalmultiplier = 1.5f;
        }else if(season.equals("Holiday")){
              seasonalmultiplier = 2.0f;
        }

        int  stayDiscount = 0;
        if(nightsBooked>=1 &&nightsBooked<=4){
            stayDiscount = 0;
        }else if(nightsBooked>=5 &&nightsBooked<=7){
            stayDiscount = 5;
        }else if(nightsBooked>=8 &&nightsBooked<=14){
            stayDiscount = 10;
        }else if(nightsBooked>=15){
            stayDiscount = 20;
        }

        int  loyaltydiscount = 0;
        if(loyaltyTier.equals("None")){
             loyaltydiscount = 0;
        }else if(loyaltyTier.equals("Member")){
             loyaltydiscount = 10;
        }else if(loyaltyTier.equals("Gold")){
             loyaltydiscount = 15;
        }else if(loyaltyTier.equals("Platinum")){
             loyaltydiscount = 20;
        }   

       float seasonalRate = perNight* seasonalmultiplier;
       float discountedRate = seasonalRate*(1-stayDiscount/100.0f)*(1-loyaltydiscount/100.0f);
        float totalCost = discountedRate * nightsBooked;


        String complimentaryUpgrades = "None";
        if(roomCategory.equals("Deluxe")&&loyaltyTier.equals("None")){
            complimentaryUpgrades = "None";
        }else  if(roomCategory.equals("Deluxe")&&loyaltyTier.equals("Gold")){
              complimentaryUpgrades = "Free breakfast and spa access";
        }else  if(roomCategory.equals("Suite")&&loyaltyTier.equals("Member")){
              complimentaryUpgrades = "Free breakfast";
        }else if(roomCategory.equals("Presidential")&&loyaltyTier.equals("Platinum")){
              complimentaryUpgrades = "Concierge service, airport transfer, and fine dining";
        }
        System.out.println("Room Category: "+roomCategory);
        System.out.println("Season: "+season);
        System.out.println("Nights Booked: "+nightsBooked);
        System.out.println("Loyalty Tier: "+loyaltyTier);
        System.out.println("Base Rate Per Night: $"+perNight);
        System.out.println("Seasonal Multiplier: "+seasonalmultiplier+"x");
        System.out.println("Extended Stay Discount: "+stayDiscount+"%");
        System.out.println("Loyalty Discount: "+loyaltydiscount+"%");
        System.out.println("Nightly Rate: $"+seasonalRate);
        System.out.println("Total Booking Cost: $"+totalCost);
        System.out.println("Complimentary Upgrades: "+complimentaryUpgrades);

        scan.close();
    }
}
