import java.util.Scanner;

public class Forloop15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        double baseFare = 0.0;
        double totalDistance = 0.0;
        double totalRevenue = 0.0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            count ++;
            double distance = scan.nextDouble();
            scan.nextLine();
            String timeOfDay = scan.nextLine();
            double distanceCharge = distance; 
            double timeSurcharge = 0.0;

            if (timeOfDay.equals("Evening")) {
                timeSurcharge = 3.0;
            } 
            else if (timeOfDay.equals("Night")) {
                timeSurcharge = 5.0;
            }

            double totalFare = baseFare + distanceCharge + timeSurcharge;

            totalDistance += distance;
            totalRevenue += totalFare;

            System.out.println("Ride " + count);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Time: " + timeOfDay);
            System.out.println("Base Fare: $" + baseFare);
            System.out.println("Distance Charge: $" + distanceCharge);
            System.out.println("Time Surcharge: $" + timeSurcharge);
            System.out.println("Total Fare: $" + totalFare);
            System.out.println();
        }

        double averageFare = totalRevenue / n;

        System.out.println("Total Rides: " + n);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fare: $" + averageFare);

        scan.close();
    }
}
