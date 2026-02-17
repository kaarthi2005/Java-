import java.util.*;
public class Conditonal7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int heartRate = scan.nextInt();
        scan.nextLine();
        String  bloodPressure = scan.nextLine();
        float temperature = scan.nextFloat();
        scan.nextLine();
        System.out.println(" symptomSeverity (Mild, Moderate, Severe, or Life-Threatening");
        String symptomSeverity = scan.nextLine();


        String [] hello = bloodPressure.split("/");
        int pressue =Integer.parseInt(hello[0]);
        int wait_Time = 0;
        String condtion = null;
        String  Action = null;

        if((heartRate <50 || heartRate>130) && (pressue >180 || pressue <90) &&(temperature >103 || temperature <96) && (symptomSeverity.equals("Life-Threatening"))){
              condtion = "Critical";
              wait_Time = 0;
              Action = "Immediate Emergency Care";
        }else if(((heartRate >=50 && heartRate <= 60 )||((heartRate >=110 && heartRate <= 130))) && (((pressue >=160 )&&(pressue <= 180)|| (pressue >=90)&&(pressue <= 100))) &&(((temperature >=101 )&&(temperature <= 103)||(temperature >= 96)&&( temperature <=97))) && (symptomSeverity.equals("Severe"))){
              condtion = "Urgent";
              wait_Time = 20;
              Action =" Priority Medical Attention";
        }else if(symptomSeverity.equals("Moderate")){
              condtion = "Standard";
              wait_Time = 45;
              Action ="Standard Examination";
        }else if(symptomSeverity.equals("Mild")){
                condtion = "Non-Urgent";
                wait_Time = 90;
                Action = "Routine Check-up";
        }


        System.out.println("Heart Rate: "+heartRate+"bpm");
        System.out.println("Blood Pressure: "+bloodPressure);
        System.out.println("Temperature: "+temperature+"'F");
        System.out.println("Symptom Severity: "+symptomSeverity);
        System.out.println("Triage Priority: "+condtion);
        System.out.println("Estimated Wait Time: "+wait_Time+" minutes");
        System.out.println("Recommended Action: "+Action);

        scan.close();
    }
}
