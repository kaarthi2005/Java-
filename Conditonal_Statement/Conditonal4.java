import java.util.Scanner;

public class Conditonal4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("loyaltyTier (Bronze, Silver, Gold, or Platinum)");
        String tier = scan.nextLine();
        System.out.println("CartValue");
        float cart = scan.nextFloat();
        scan.nextLine();
        System.out.println(" productCategory (Electronics, Fashion,Groceries, or Books");
        String Category = scan.nextLine();
        System.out.println(" membershipStatus (Prime or Regular)");
        String Membership = scan.nextLine();


        int base_discount =0;
        if(tier.equals("Bronze")){
            base_discount =5;
        }else if(tier.equals("Silver")){
            base_discount =8;
        }else if(tier.equals("Gold")){
            base_discount =12;
        }else if(tier.equals("Platinum")){
            base_discount =15;
        }


        int additional_Discount = 0;
        if(cart >=500 && cart <=999){
            additional_Discount = 3;
        }else if(cart >=1000 && cart <=1999){
            additional_Discount = 5;
        }else if(cart>=2000){
            additional_Discount = 7;
        }
        int bouns = 0;
        if(Category.equals("Fashion")){
                bouns = 5;
         }
        else if ((Category.equals("Electronics") && Membership.equals("Prime") ) || (Category.equals("Books") && Membership.equals("Prime"))){
                bouns = 5;
        }        
        else if(Category.equals("Groceries") && cart>300 ){
                bouns = 2;
        }



        int total_Discount = base_discount+additional_Discount+bouns;
        float finalPrice = (cart*total_Discount-1)/100.0f;
        float Saving = cart-finalPrice;


        System.out.println("Loyalty Tier: "+tier);
        System.out.println("Cart Value: $"+cart);
        System.out.println("Product Category: "+Category);
        System.out.println("Membership: "+Membership);
        System.out.println("Base Discount: "+base_discount+" %");
        System.out.println("Additional Discount: "+ (additional_Discount+bouns));
        System.out.println("Total Discount: "+total_Discount+"%");
        System.out.println("Final Price: $"+Saving);
        System.out.println("Savings: $"+finalPrice);



        scan.close();
    }
}
