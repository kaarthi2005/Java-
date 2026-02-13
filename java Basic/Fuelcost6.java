import java.util.Scanner;

public class Fuelcost6 {
    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Distance: ");
        int distance = scan.nextInt();
        System.out.println("Enter a Meliage: ");
        int mileage = scan.nextInt();
        System.out.println("Enter a Feulprice: ");
        int fuelPrice = scan.nextInt();
        System.out.println("Enter a tollchagre: ");
        int tollcharge = scan.nextInt();

        int cal_distance_point = distance /mileage;
        int cal_fuel = cal_distance_point*fuelPrice;

        System.out.println(cal_fuel+tollcharge);
    }
}
