import java.util.Scanner;

public class Forloop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double totalRevenue = 0;
        int peakHourCount = 0;

        for (int i = 1; i <= n; i++) {
            String vehicleType = sc.next();
            double hoursParked = sc.nextDouble();
            double hourlyRate = 0;
            double dailyCap = 0;
            if (vehicleType.equals("Car")) {
                hourlyRate = 3.0;
                dailyCap = 30.0;
            } else if (vehicleType.equals("Motorcycle")) {
                hourlyRate = 2.0;
                dailyCap = 20.0;
            } else if (vehicleType.equals("Truck")) {
                hourlyRate = 5.0;
                dailyCap = 60.0;
            } else if (vehicleType.equals("Bus")) {
                hourlyRate = 7.0;
                dailyCap = 100.0;
            }
            double calculatedFee = hoursParked * hourlyRate;
            double finalFee = 0;
            String capApplied = "No";
            if (calculatedFee > dailyCap) {
                finalFee = dailyCap;
                capApplied = "Yes";
            } else {
                finalFee = calculatedFee;
                capApplied = "No";
            }
            if (hoursParked > 8) {
                peakHourCount++;
            }
            totalRevenue += finalFee;
            System.out.println("Vehicle " + i + ": " + vehicleType);
            System.out.println("Hours Parked: " + hoursParked);
            System.out.println("Hourly Rate: $" + hourlyRate);
            System.out.println("Parking Fee: $" + finalFee);
            System.out.println("Cap Applied: " + capApplied);
            System.out.println();
        }
        double averageFee = 0;
        if (n > 0) {
            averageFee = totalRevenue / n;
        }
        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.print("Average Fee: $");
        System.out.printf("%.2f\n", averageFee); 
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakHourCount);

        sc.close();
    }
}