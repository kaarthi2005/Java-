import java.util.Scanner;

public class Forloop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float avgOccupancy = 0;
        float max = Float.MAX_VALUE;
        int peak = 0;
        int count =0;
        int Full = 0;
        for(int i=0 ;i<n ;i++){
            int day = scan.nextInt();
            int roomOccupied = scan.nextInt();
            int totalRooms = scan.nextInt();

            float  occupancyrate = (totalRooms/roomOccupied)*100;
            String  status = null;
            if(occupancyrate == 100){
                status = "Full";
                Full++;
            }else  if(occupancyrate >=80 && occupancyrate <=99){
                status = "High";
            }else  if(occupancyrate >=60 && occupancyrate <=79){
                status = "Moderate";
            }else  if(occupancyrate <60){
                status = "Low";
            }

            count++;
            avgOccupancy += occupancyrate;
            if(max < occupancyrate){
                max = occupancyrate;
                peak = day;
            }
            System.out.println();
            System.out.println();
            System.out.println("Day: "+day);
            System.out.println("Rooms Occupied: "+roomOccupied);
            System.out.println("Total Rooms: "+totalRooms);
            System.out.println("Occupancy Rate: "+occupancyrate+"%");
            System.out.println("Status: "+status);
            System.out.println();
            System.out.println();

        }
        System.out.println("Total Days Analyzed: "+count);
        System.out.println("Average Occupancy Rate: "+(avgOccupancy/count));
        System.out.println("Peak Occupancy Day: Day "+peak);
        System.out.println("Days at Full Capacity: "+Full);
    }
}
