import java.util.Scanner;

public class probelm23{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total kg of weight: ");
        int weight = scan.nextInt();
        
        System.out.println("Enter a rate per kg");
        int rate = scan.nextInt();

        System.out.println("Enter a prioritycharges : ");
        int prioritycharges = scan.nextInt();

        System.out.println("Enter a amount for insurancefees : ");
        int insurance = scan.nextInt();

        System.out.println("Enter a amount of handling : ");
        int handling= scan.nextInt();

        System.out.println("Enter a total amount of fuelsurcharge");
        int feul = scan.nextInt();


        int total = (weight * rate)+prioritycharges+insurance-handling-feul;

        System.out.println(total);
    }
}

