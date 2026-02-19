import java.util.Scanner;

public class Conditonal17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String cardTier  = scan.nextLine();
        String purchaseCategory  = scan.nextLine();
        float transactionAmount  = scan.nextFloat();
        scan.nextLine();
        String promotionalStatus  = scan.nextLine();

        float  basepoints = 1.0f;

        float categorybonus = 0;
        if(purchaseCategory.equals("Groceries")){
            categorybonus = 2.0f;
        }else if(purchaseCategory.equals("Dining")){
            categorybonus = 2.5f;
        }else if(purchaseCategory.equals("Travel")){
            categorybonus = 3.0f;
        }else if(purchaseCategory.equals("Gas")){
            categorybonus = 2.0f;
        }else if(purchaseCategory.equals("Other")){
            categorybonus = 1.0f;
        }


        float tiermultiplier = 0;
        String Rewards= null;
        if(cardTier.equals("Basic")){
            tiermultiplier = 1.0f;
             Rewards= "Standard";
        }else if(cardTier.equals("Gold")){
            tiermultiplier = 1.25f;
            Rewards= "Enhanced";
        }else if(cardTier.equals("Platinum")){
            tiermultiplier = 1.5f;
            Rewards = "Premium";
        }else if(cardTier.equals("Back")){
            tiermultiplier = 2.0f;
            Rewards= "Elite";
        }


         float  promotionalmultiplier = 0;
        if(promotionalStatus.equals("None")){
            promotionalmultiplier = 1.0f;
        }else if(promotionalStatus.equals("Double-Points")){
            promotionalmultiplier = 2.0f;
        }else if(promotionalStatus.equals("Triple-Points")){
            promotionalmultiplier = 3.0f;
        }

        float pointsEarned = transactionAmount*basepoints*categorybonus*tiermultiplier*promotionalmultiplier;

        float cashvalue = (pointsEarned*basepoints)/100.0f;

        System.out.println("Card Tier: "+cardTier);
        System.out.println("Purchase Category: "+purchaseCategory);
        System.out.println("Transaction Amount: $"+transactionAmount);
        System.out.println("Promotional Status: "+promotionalStatus);
        System.out.println("Base Points Rate: "+basepoints+"points per dollar");
        System.out.println("Category Bonus: "+categorybonus+"%");
        System.out.println("Tier Multiplier: "+tiermultiplier+"x");
        System.out.println("Promotional Multiplier: "+promotionalmultiplier);
        System.out.println("Points Earned: "+pointsEarned);
        System.out.println("Equivalent Cash Value: $"+cashvalue);
        System.out.println("Reward : "+Rewards);

        













        scan.close();
    }
}
