import java.util.Scanner;

public class probelm15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total no of Room: ");
        int room = scan.nextInt();
        System.out.println("Enter a room price: ");

        int price = scan.nextInt();
        System.out.println("Enter a servicecharge: ");

        int servicecharge = scan.nextInt();
        
        System.out.println("Enter a commission: ");

        int commission = scan.nextInt();

        int total = (room * price) + servicecharge - commission;

        System.out.println(total);
    }
}
