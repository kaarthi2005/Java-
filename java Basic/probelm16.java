
import java.util.Scanner;

public class probelm16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total no of genPass: ");
        int genpass = scan.nextInt();
        System.out.println("Enter a amount of genpass: ");

        int genfare = scan.nextInt();
        System.out.println("Enter a total no of ACpass: ");

        int ACpass = scan.nextInt();
        System.out.println("Enter a amount of ACpass: ");

        int ACfare= scan.nextInt();
        System.out.println("Enter a platfrom fee: ");

        int platfrom = scan.nextInt();

        System.out.println("Enter a maintanince: ");

        int maintainance = scan.nextInt();
        System.out.println("Enter a feulcost: ");

        int feulcost = scan.nextInt();



        int total = (genpass*genfare) + (ACfare*ACpass) + platfrom -maintainance - feulcost;

        System.out.println(total);
    }
}
