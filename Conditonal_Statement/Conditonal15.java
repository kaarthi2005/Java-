import java.util.Scanner;

public class Conditonal15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userCount = scan.nextInt();

        scan.nextLine();
        String licenseType =scan.nextLine();
        String supportLevel = scan.nextLine();
        int contractYears = scan.nextInt();

        float baseprice = 0;
         if(licenseType.equals("Standard")){
            baseprice = 60;
         }else  if(licenseType.equals("Professional")){
            baseprice = 120;
         }else  if(licenseType.equals("Enterprise")){
            baseprice = 200;
         }

         int volumediscount = 0;
         if(userCount >= 1 && userCount <=50){
            volumediscount = 0;
         }else if(userCount >= 51 && userCount <=200){
            volumediscount = 15;
         }else if(userCount >= 201 && userCount <=500){
            volumediscount = 20;
         }else if(userCount >= 501 && userCount <=1000){
            volumediscount = 25;
         }else {
            volumediscount = 35;
         }

         float supportfee = 0;
         String pricingTier = null; 
         if(supportLevel.equals("Basic")){
                supportfee = 10;
                pricingTier = "Small Business";
         }else if(supportLevel.equals("Priority")){
                supportfee = 30;
                pricingTier ="Mid-Market";
         }else if(supportLevel.equals("Premium")){
                supportfee = 80;
                pricingTier = "Enterprise";
         }
        
         int  multiyeardiscount= 0;
         if(contractYears ==1){
            multiyeardiscount= 0;
         }else if(contractYears ==2){
            multiyeardiscount= 5;
         }else if(contractYears ==3){
            multiyeardiscount= 10;
         }else if(contractYears ==5){
            multiyeardiscount= 20;
         }

         float discountedBase = baseprice*(1-volumediscount/100.0f);
         float annualPerUser = (discountedBase+supportfee)*(1-multiyeardiscount/100.0f);
         float totalAnnual = annualPerUser*userCount;
         float contractValue = totalAnnual*contractYears;


         System.out.println("User Count: "+userCount);
         System.out.println("License Type: "+licenseType);
         System.out.println("Support Level: "+supportLevel);
         System.out.println("Contract Duration: "+contractYears);
         System.out.println("Base Price Per User: $"+baseprice);
         System.out.println("Volume Discount: "+volumediscount);
         System.out.println("Support Fee Per User: $"+supportfee);
         System.out.println("Multi-Year Discount: "+multiyeardiscount+"%");
         System.out.println("Annual Cost Per User: $"+annualPerUser);
         System.out.println("Total Annual Cost: $"+totalAnnual);
         System.out.println("Total Contract Value: $"+contractValue);
         System.out.println("Pricing Tier: "+pricingTier);



         scan.close();
    }
}
