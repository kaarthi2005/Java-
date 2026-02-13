
import java.util.Scanner;

public class probelm22{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total copies: ");
        int copies = scan.nextInt();
        System.out.println("Enter a price : ");

        int cost = scan.nextInt();
        System.out.println("Enter a amount for editing : ");

        int editing = scan.nextInt();
        System.out.println("Enter a amount of design: ");

        int design= scan.nextInt();

        System.out.println("Enter a total amount of commission");
        int commission = scan.nextInt();

        System.out.println("Enter a total amount of marketing");
        int marketing = scan.nextInt();

        int total = (copies*cost)+editing+design-commission-marketing;

        System.out.println(total);
    }
}

