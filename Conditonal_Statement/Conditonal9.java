import java.util.Scanner;

public class Conditonal9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double annualRevenue = scan.nextDouble();
        System.out.println("businessType (\"LLC\", \"S-Corp\", \"C-Corp\", or \"Partnership\")");
        scan.nextLine();
        String businessType = scan.nextLine();
        Double deductibleExpenses = scan.nextDouble();
        Double taxCredits = scan.nextDouble();

        int taxRate = 0;

        Double taxableIncome = annualRevenue-deductibleExpenses;

        if(businessType.equals("LLC")){
            if(taxableIncome <500000){
                taxRate = 21;
            }else if(taxableIncome >=500000 && taxableIncome<=1000000){
                taxRate = 24;
            }else if(taxableIncome >=1000000 && taxableIncome<=2000000){
                taxRate = 28;
            }else{
                taxRate = 30;
            }

        }else if(businessType.equals("S-Corp")){
            if(taxableIncome <500000){
                taxRate = 20;
            }else if(taxableIncome >=500000 && taxableIncome<=1000000){
                taxRate = 25;
            }else{
                taxRate = 28;
            }
        }else if(businessType.equals("C-Corp")){
            if(taxableIncome <200000){
                taxRate = 15;
            }else if(taxableIncome >=200000 && taxableIncome<=500000){
                taxRate = 18;
            }else{
                taxRate = 22;
            }
        }else if(businessType.equals("Partnership")){
              if(taxableIncome <300000){
                taxRate = 18;
            }else if(taxableIncome >=300000 && taxableIncome<=800000){
                taxRate = 22;
            }else{
                taxRate = 26;
            }
        }


        Double grossTax = (taxableIncome * taxRate)/100;
        Double netTax = grossTax-taxCredits;
        Double effectiveTax = (netTax/annualRevenue)*100.0f;


        System.out.println("Annual Revenue: $"+annualRevenue);
        System.out.println("Business Type: "+businessType);
        System.out.println("Deductible Expenses: $"+deductibleExpenses);
        System.out.println("Tax Credits: $"+taxCredits);
        System.out.println("Taxable Income: $"+taxableIncome);
        System.out.println("Tax Rate:"+taxRate+"%");
        System.out.println("Gross Tax: $"+grossTax);
        System.out.println("Net Tax After Credits: $"+netTax);
        System.out.printf("Effective Tax Rate: %.2f",effectiveTax);




        scan.close();

    }
}
