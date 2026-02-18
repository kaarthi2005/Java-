import java.util.Scanner;

public class Conditonal12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int driverAge = scan.nextInt();
        scan.nextLine();
        String vehicleType = scan.nextLine();
         String drivingRecord  = scan.nextLine();
          String coverageLevel  = scan.nextLine();

        int basePrimium = 0;

        if(coverageLevel.equals("Basic")){
            basePrimium = 500;
        }else if(coverageLevel.equals("Standard")){
             basePrimium = 800;
        }else if(coverageLevel.equals("Comprehensive")){
             basePrimium = 1500;
        }

        float  ageFactor =0;
        if(driverAge >= 16 && driverAge <= 21){
            ageFactor = 1.8f;
        }else if(driverAge >= 22 && driverAge <= 25){
            ageFactor = 1.5f;
        }else if(driverAge >= 26 && driverAge <= 40){
            ageFactor = 1.0f;
        }else if(driverAge >= 41 && driverAge <= 60){
            ageFactor = 0.9f;
        }else {
            ageFactor = 1.1f;
        }

        float riskFactor =0;
        if(vehicleType.equals("Sedan")){
            riskFactor = 1.0f;
        }else if(vehicleType.equals("Sports")){
             riskFactor = 1.5f;
        }else if(vehicleType.equals("Truck")){
             riskFactor = 1.1f;
        }

        int recordAdjustment =0;
        if(drivingRecord.equals("Clean")){
            recordAdjustment = -10;
        }else if(drivingRecord.equals("Minor-Violations")){
             recordAdjustment = 25;
        }else if(drivingRecord.equals("Major-Violations")){
             recordAdjustment = 50;
        }

        float  adjustedPremium = basePrimium*ageFactor*riskFactor;
        float finalPremium  = (adjustedPremium*riskFactor)/100;
        float monthlyPremium = finalPremium/12.0f;

        System.out.println("Driver Age: "+driverAge);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Driving Record: "+drivingRecord);
        System.out.println("Coverage Level: "+coverageLevel);
        System.out.println("Base Premium: $"+basePrimium);
        System.out.println("Age Factor: "+ageFactor+"x");
        System.out.println("Vehicle Risk Factor: "+riskFactor);
        System.out.println("Record Adjustment: "+recordAdjustment+"%");
        System.out.println("Monthly Premium: $"+monthlyPremium);
        System.out.println("Annual Premium: $"+finalPremium);


        scan.close();
    }
}
