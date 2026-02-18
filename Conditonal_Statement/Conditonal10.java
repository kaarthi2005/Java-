import java.util.Scanner;

public class Conditonal10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String timeOfDay = scan.nextLine();
        float powerConsumption =scan.nextFloat();
        float renewablePercentage  =scan.nextFloat();
        scan.nextLine();
        String rateTier  = scan.nextLine();
        float baseRate =0;
        if(rateTier.equals("Basic")){
            baseRate = 0.18f;
        }else  if(rateTier.equals("Time-of-Use")){
            baseRate = 0.15f;
        }else  if(rateTier.equals("Premium-Green")){
            baseRate = 0.12f;
        }

        float rateMultiplier = 0 ;

        if(timeOfDay.equals(" Peak")){
            rateMultiplier = 1.5f;
        }else  if(timeOfDay.equals("Off-Peak")){
            rateMultiplier = 0.8f;
        }else  if(timeOfDay.equals("Super-Off-Peak")){
            rateMultiplier = 0.6f;
        }

        float renewableCredit = (powerConsumption*renewablePercentage)/100.0f * baseRate;
        float totalCost = (powerConsumption*baseRate*rateMultiplier)-renewableCredit;

        System.out.println("Time of Day: "+timeOfDay);
        System.out.println("Power Consumption: "+powerConsumption+" kWh");
        System.out.println("Renewable Energy: "+renewablePercentage+" %");
        System.out.println("Rate Tier: "+rateTier);
        System.out.println("Base Rate: $"+baseRate+"/kWh");
        System.out.println("Rate Multiplier: "+rateMultiplier+"x");
        System.out.println("Renewable Credit: $"+renewableCredit);
        System.out.printf("Total Cost: $%.1f",totalCost);



    }
}
