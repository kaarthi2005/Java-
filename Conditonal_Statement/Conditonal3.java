import java.util.Scanner;

public class Conditonal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("smokingStatus (Smoker or Non-Smoker)");
        String Smoking_Status = scan.nextLine();
        System.out.println(" preExistingConditions (Yes or No)");
        String conditon = scan.nextLine();
        System.out.println("coverageTier (Basic, Standard, or Premium");
        System.out.println("Basic ($200/$250/$350/$400), Standard ($300/$350/$450/$550), Premium ($500/$600/$700/$800)" );
        String Coverage = scan.nextLine();
        float amount = scan.nextInt();



       
        float risk = 0;
         

        if (age <= 18 && age >= 100) {
           if(Smoking_Status.equals("Smoker") && conditon.equals("Yes")){
            risk = 70;
           }else if(Smoking_Status.equals("Smoker")){
            risk = 40;
           }else if(conditon.equals("Yes")){
            risk = 30;
           }
        }

        float total = (amount*risk)/100.0f;
        float output = total+amount;

        System.out.println("Age: "+age);
        System.out.println("Smoking Status: "+Smoking_Status);
        System.out.println("Pre-existing Conditions: "+conditon);
        System.out.println("Coverage Tier: "+Coverage);
        System.out.println("Base Premium: $"+amount);
        System.out.println("Risk Surcharge: $"+total);
        System.out.println("Total Monthly Premium: $"+output);

        scan.close();
    }
}
