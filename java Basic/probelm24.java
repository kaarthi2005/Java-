import java.util.Scanner;

public class probelm24{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total fund of registration: ");
        int reg = scan.nextInt();
        
        System.out.println("Enter a amount of broadcast");
        int broadcast = scan.nextInt();

        System.out.println("Enter a sponsor : ");
        int sponsor = scan.nextInt();

        System.out.println("Enter a amount for prices : ");
        int price = scan.nextInt();

        System.out.println("Enter a amount of rent for stadium : ");
        int rent= scan.nextInt();

        System.out.println("Enter a total amount of ad");
        int ad = scan.nextInt();


        int total = reg+broadcast+sponsor-price-rent-ad;

        System.out.println(total);
    }
}

