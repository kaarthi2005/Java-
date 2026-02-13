
import java.util.Scanner;

public class probelm20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total amount of ads: ");
        int ads = scan.nextInt();
        System.out.println("Enter a amount of sponsor: ");

        int sponsor = scan.nextInt();
        System.out.println("Enter a amount of affilitate : ");

        int affilitate = scan.nextInt();
        System.out.println("Enter a amount of tax: ");

        int tax= scan.nextInt();

        System.out.println("Enter a total amount of production");
        int production = scan.nextInt();

        int total =ads+sponsor+affilitate-tax-production;

        System.out.println(total);
    }
}

