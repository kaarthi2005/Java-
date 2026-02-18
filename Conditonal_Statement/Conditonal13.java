import java.util.Scanner;

public class Conditonal13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String studentStatus = scan.nextLine();
        int creditHours = scan.nextInt();
        scan.nextLine();
        String programType = scan.nextLine();
        String residency = scan.nextLine();

        int  percredit = 0;
        if(programType.equals("Undergraduate")){
            percredit = 350;
        }else if(programType.equals("Graduate")){
            percredit = 550;
        }else if(programType.equals("Professional")){
            percredit = 800;
        }

        float residencyMultiplier = 0;
        if(residency.equals("In-State")){
            residencyMultiplier = 1.0f;
        }else if(residency.equals("Out-of-State")){
            residencyMultiplier =2.5f;
        }else if(residency.equals("International")){
            residencyMultiplier = 3.0f;
        }

        int programfee = 0;
        int activityfee = 0;
       
        if(studentStatus.equals("Full-Time") && programType.equals("Undergraduate")){
            programfee = 500;
            activityfee = 200;
        }else if(studentStatus.equals("Full-Time") && programType.equals("Graduate")){
            programfee = 750;
            activityfee = 200;
        }else if(studentStatus.equals("Full-Time") && programType.equals("Professional")){
            programfee = 1200;
            activityfee = 200;
        }else if(studentStatus.equals("Part-Time") && programType.equals("Undergraduate")){
            programfee = 300;
            activityfee = 100;
        }else if(studentStatus.equals("Part-Time") && programType.equals("Graduate")){
            programfee = 750;
            activityfee = 100;
        }else if(studentStatus.equals("Part-Time") && programType.equals("Professional")){
            programfee = 900;
            activityfee = 100;
        }else if(studentStatus.equals("Continuing-Education") ){
            programfee = 150;
            activityfee = 50;
        }

        float tuitionCost = creditHours*percredit*residencyMultiplier;
        float totalFee = tuitionCost+programfee+activityfee;


        String assignCategory = null ;
        if(studentStatus.equals("Full-Time") && residency.equals("In-State")){
            assignCategory ="Standard";
        }else if(studentStatus.equals("Continuing-Education") ){
             assignCategory ="Reduced";
        }else if(residency.equals("Out-of-State") || residency.equals("International")){
             assignCategory ="Premium";
        }

        System.out.println("Student Status: "+studentStatus);
        System.out.println("Credit Hours: "+creditHours);
        System.out.println("Program Type: "+programType);
        System.out.println("Residency: "+residency);
        System.out.println("Base Tuition Per Credit: $"+percredit);
        System.out.println("Residency Multiplier: "+residencyMultiplier+"%");
        System.out.println("Program Fee: $"+programfee);
        System.out.println("Student Activity Fee: $"+activityfee);
        System.out.println("Total Registration Fee: $"+totalFee);
        System.out.println("Fee Category: "+assignCategory);








        scan.close();
    }
}
