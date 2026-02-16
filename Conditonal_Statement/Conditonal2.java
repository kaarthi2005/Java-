import java.util.*;

public class Conditonal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int credit_Score = scan.nextInt();
        float annualIncome = scan.nextFloat();
        float debt_Ratio = scan.nextFloat();

        System.out.println("Enter Loan type  Personal , Home , Busines");
        scan.nextLine();
        String loan_Type = scan.nextLine();

        String range = null ;
        String debit = null;
        if (debt_Ratio < 50) {
            if (debt_Ratio <= 30) {
                range = "Low";
            }
            if (debt_Ratio >= 40 && debt_Ratio <= 31) {
                range = "Moderate";
            }
            if (debt_Ratio > 40) {
                range = "High";
            }
        }

        if (credit_Score > 600) {
            if (credit_Score >= 750) {
                debit = "Excellent";

            } else if (credit_Score <= 700 && credit_Score >= 749) {
                debit = "Good";
            } else if (credit_Score <= 650 && credit_Score >= 699) {
                debit = "Fair";
            } else {
                debit = "Poor";
            }

        }
        float output = 0;
        String decision = "Needs Review";

        if(loan_Type.equals("Personal")){
            
            if (debit.equals ("Excellent") && range.equals("Low")){
                output = annualIncome*1;
                decision = "Approved";
            }
            else if (debit.equals ("Good") && range.equals("Moderate")){
                output = annualIncome*0.5f;
                decision = "Needs Review";
            }


        }
        else if(loan_Type.equals("Home")){

           
             if (debit.equals ("Excellent") && range.equals("Low")){
                output = annualIncome*4;
                decision = "Approved";
            }
            else if (debit.equals ("Fair") && range.equals("Moderate")){
                output = annualIncome*3;
                 decision = "Needs Review";

            }
        }
        else if(loan_Type.equals("Busines")){

            if (debit.equals ("Excellent") && range.equals("Low") || debit.equals ("Good") && range.equals("Moderate")){
                output = annualIncome*3;
                 decision = "Approved";
            }
        }


        System.out.println("Credit Score: "+credit_Score);
        System.out.println("Annual Income: $"+annualIncome);
        System.out.println("Debt-to-Income Ratio: "+debt_Ratio+" %");
        System.out.println("Loan Type: "+loan_Type);
        System.out.println("Decision: "+decision);
        System.out.println("Maximum Loan Amount: $"+(float)output);

        scan.close();
    }
}
