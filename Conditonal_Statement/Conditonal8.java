import java.util.Scanner;

public class Conditonal8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String locationTier = scan.nextLine();
        int squareFootage = scan.nextInt();
        int propertyAge = scan.nextInt();
        int amenityScore = scan.nextInt();

        int agePercent = 0;
        if (propertyAge <= 5) {
            agePercent = 0;
        } else if (propertyAge <= 10) {
            agePercent = -5;
        } else if (propertyAge <= 15) {
            agePercent = -10;
        } else if (propertyAge <= 25) {
            agePercent = -15;
        } else if (propertyAge <= 30) {
            agePercent = -20;
        } else {
            agePercent = -30;  
        }

        float base_Price = 0;
        if (locationTier.equals("Prime")) {
            base_Price = 400;
        } else if (locationTier.equals("Urban")) {
            base_Price = 300;
        } else if (locationTier.equals("Suburban")) {
            base_Price = 180;
        } else if (locationTier.equals("Rural")) {
            base_Price = 100;
        }
        float baseValue = squareFootage * base_Price;
        float adjustedValue = baseValue * (1 + agePercent / 100.0f);

        float amenityPercent = 0;

        if (amenityScore >= 80 && amenityScore <= 100) {
            amenityPercent = 10;
        } else if (amenityScore >= 60) {
            amenityPercent = 5;
        } else if (amenityScore >= 40) {
            amenityPercent = 2;
        } else {
            amenityPercent = 0;
        }

        float amenity_Bonus = baseValue * (amenityPercent / 100.0f);
        float finalValue = adjustedValue + amenity_Bonus;

        
        String market= null;;
        if ((locationTier.equals("Prime") || locationTier.equals("Urban")) 
                && propertyAge < 15) {
            market = "Hot";
        } else if (locationTier.equals("Suburban")) {
            market = "Stable";
        } else {
            market = "Slow";
        }


        System.out.println("Location Tier: " + locationTier);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + base_Price);
        System.out.println("Age Adjustment: " + agePercent + "%");
        System.out.println("Amenity Bonus: $" + amenity_Bonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + market);

        scan.close();
    }
}
