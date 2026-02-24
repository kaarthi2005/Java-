import java.util.Scanner;

public class Forloop9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int totalCaloriesBurned = 0;
        int totalDuration = 0;
       
        for(int i=0 ;i<n ;i++){
            scan.nextLine();
            String exerciseType = scan.nextLine();
            int durationMinutes = scan.nextInt();


            int calories = 0;
            String intensity = null;
            if(exerciseType.equals("Running")){
                calories = 10;
                intensity = "High";
            }else if(exerciseType.equals("Swimming")){
                calories = 12;
                intensity = "High";
            }else if(exerciseType.equals("Cycling")){
                calories = 8;
                intensity = "Moderate";
            }else if(exerciseType.equals("Gym")){
                calories = 7;
                intensity = "Moderate";
            }else if(exerciseType.equals("Walking")){
                calories = 4;
                intensity = "Low";
            }

            int CaloriesBurned = calories*durationMinutes;
            totalCaloriesBurned +=  CaloriesBurned;
            totalDuration += durationMinutes;
            

            System.out.println();
            System.out.println();
            System.out.println("Session 1: "+exerciseType);
            System.out.println("Duration: "+durationMinutes+" minutes");
            System.out.println("Calories Burned: "+CaloriesBurned);
            System.out.println("Intensity: "+intensity);
            System.out.println();
            System.out.println();

        }
        System.out.println("Total Workouts: "+n);
        System.out.println("Total Duration: "+totalDuration+" minutes");
        System.out.println("Total Calories Burned: "+totalCaloriesBurned);
        float avgcal = totalCaloriesBurned/n;
        System.out.printf("Average Calories per Session: %.1f\n",avgcal);
        String  fitnesslevel = null;
        if(totalCaloriesBurned<300){
            fitnesslevel = "Beginner";
        }else if(totalCaloriesBurned>=300 && totalCaloriesBurned <1000){
            fitnesslevel ="Intermediate";
        }else{
            fitnesslevel ="Advanced";
        }
        System.out.println("Fitness Level: "+fitnesslevel);
        System.out.println();
        scan.close();
    }
}
