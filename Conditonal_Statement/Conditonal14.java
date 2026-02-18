import java.util.Scanner;

public class Conditonal14 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String membershipTeir = scan.nextLine();
        int contactLength = scan.nextInt();
        scan.nextLine();
        String accessLevel = scan.nextLine();
        String addOns = scan.nextLine();

        float basefee =0 ;
        if(membershipTeir.equals("Basic")){
            basefee = 40 ;
        }else if(membershipTeir.equals("Premium")){
            basefee = 80 ;
        }else if(membershipTeir.equals("Elite")){
            basefee = 120 ;
        }else if(membershipTeir.equals("VIP")){
            basefee =150 ;
        }

        float contractdiscount = 0;
        if(contactLength >= 1 && contactLength <=5){
           contractdiscount = 0;
        }else if(contactLength >= 6 && contactLength <=11){
           contractdiscount = 10;
        }else if(contactLength >= 12 && contactLength <=23){
           contractdiscount = 15;
        }else{
            contractdiscount = 25;
        }

        float accessfee = 0;
         
        if(accessLevel.equals(" Single-Location")){
           accessfee = 0;
        }else if(accessLevel.equals("Regional")){
          accessfee = 20;
        }else if(accessLevel.equals("Nationwide")){
           accessfee = 50;
        }

        float addonfee = 0;
         
        if(addOns.equals("None")){
           addonfee = 0;
        }else if(addOns.equals("Personal-Training")){
          addonfee = 100;
        }else if(addOns.equals("Classes")){
           addonfee = 50;
        }else if(addOns.equals("Full-Package")){
           addonfee = 200;
        }


        float discountedBase = basefee *(1- contractdiscount/100.0f);
        float monthlyTotal = discountedBase+accessfee+addonfee;
        float contractTotal = monthlyTotal*contactLength;

        float savings = (basefee+accessfee+addonfee)*contactLength - contractTotal;

        String MembershipCategory = null;

        if(monthlyTotal <100){
            MembershipCategory = "Budget";
        }else if(monthlyTotal >200){
            MembershipCategory = "Luxury";
        }else if(monthlyTotal >= 100 && monthlyTotal <150){
            MembershipCategory = "Standard";
        }else if(monthlyTotal >=150 && monthlyTotal<200){
            MembershipCategory = "Preminum";
        }


        System.out.println("Membership Tier: "+membershipTeir);
        System.out.println("Contract Length: "+contactLength+" months");
        System.out.println("Access Level: "+accessLevel);
        System.out.println("Add-Ons: "+addOns);
        System.out.println("Base Monthly Fee: $"+basefee);
        System.out.println("Contract Discount: "+contractdiscount+" %");
        System.out.println("Access Fee: $"+accessfee);
        System.out.println("Add-On Fee: $"+addonfee);
        System.out.println("Monthly Total: $"+monthlyTotal);
        System.out.println("Contract Total: $"+contractTotal);
        System.out.println("Savings vs Month-to-Month: $"+savings);
        System.out.println("Membership Category: "+MembershipCategory);



        scan.close();

    }
}
