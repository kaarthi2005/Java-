import java.util.Scanner;

public class probelm25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a amount for residentialusage: ");
        int resusage = scan.nextInt();

        System.out.println("Enter a amount for resRate");
        int resrate = scan.nextInt();

        System.out.println("Enter a comusage : ");
        int com_usager = scan.nextInt();

        System.out.println("Enter a comprice : ");
        int com_price = scan.nextInt();

        System.out.println("Enter a amount for connection fees : ");
        int connection = scan.nextInt();

        System.out.println("Enter a amount of penaltiy for connetions");
        int penaltiy = scan.nextInt();

        System.out.println("Enter a amount for pipeline maintainance : ");
        int pipeline_maintanance = scan.nextInt();

        System.out.println("Enter a amount for treatment");
        int treatment = scan.nextInt();

        int total = (resusage * resrate) + (com_price * com_usager) + connection + penaltiy - pipeline_maintanance
                - treatment;

        System.out.println(total);
    }
}
