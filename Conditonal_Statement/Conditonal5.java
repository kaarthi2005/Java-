import java.util.Scanner;

public class Conditonal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter GPA 0.0 to 4.0: ");
        float GPA = scan.nextFloat();

        System.out.println("ENter your Famil inncome : ");
        float Income = scan.nextFloat();

        System.out.println("ExtraCurricularScore 0 to 100");
        int extracurricular_Score = scan.nextInt();

        System.out.println(" scholarshipType (Merit, Need-Based, or Sports)");
        scan.nextLine();

        String schorship_Type = scan.nextLine();
        String Award_Category ="None";
        int Award_Amount = 0;
        int a = 1;

        if(GPA >=2.5){
            if(schorship_Type.equals("Merit")){
                if(GPA>=3.8  && extracurricular_Score >=80){
                    Award_Category = "Full";
                    Award_Amount = 25000;
                }else if(GPA>=3.5  && extracurricular_Score >=70){
                    Award_Category = "Partial";
                    Award_Amount = 15000;
                }else if(GPA>=3.0  && extracurricular_Score >=60){
                    Award_Category = "Minimal";
                    Award_Amount = 25000;
                }
            }
            else if(schorship_Type.equals("Need-Based")){
                if(GPA>=3.5  && Income <=30000){
                    Award_Category = "Full";
                    Award_Amount = 30000;
                }else if(GPA>=3.0  && Income <=50000){
                    Award_Category = "Partial";
                    Award_Amount = 18000;
                }else if(GPA>=2.8  && Income <=70000){
                    Award_Category = "Minimal";
                    Award_Amount = 10000;
                }
            }
            else   if(schorship_Type.equals("Merit")){
                if(GPA>=3.0  && extracurricular_Score >=85){
                    Award_Category = "Full";
                    Award_Amount = 22000;
                }else if(GPA>=2.8  && extracurricular_Score >=75){
                    Award_Category = "Partial";
                    Award_Amount = 20000;
                }else if(GPA>=2.5  && extracurricular_Score >=65){
                    Award_Category = "Minimal";
                    Award_Amount = 12000;
                }
            }
        }else{
            System.out.println("The minimum Eligibility need Above 2.5 .");
            a =0;
        }

        if(a==1){
            System.out.println("GPA: "+GPA);
            System.out.println("Family Income: $"+Income);
            System.out.println("Extracurricular Score: "+extracurricular_Score);
            System.out.println("Scholarship Type: "+schorship_Type);
            if(Award_Amount == 0){
            System.out.println("Eligibility: Not Eligible");
            }else{
                System.out.println("Eligibility: Eligible");
            }
            System.out.println("Award Amount: $"+Award_Amount);
            System.out.println("Award Category: "+Award_Category);
        }



        scan.close();
    }
}
