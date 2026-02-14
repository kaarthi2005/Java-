import java.util.Scanner;

public class Operator4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int creditlimit = scan.nextInt();
        int purchaseAmount = scan.nextInt();
        System.out.println("Card active means press 0 and not means press 1");
        int cardBloced = scan.nextInt();

        if (cardBloced == 1) {
            System.out.println("Declined");
        } else {
            if (creditlimit >= purchaseAmount) {
                System.out.println("Approved");
            } else {
                System.out.println("Declined");
            }
        }

    }
}
