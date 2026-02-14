import java.util.Scanner;

public class Operator7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cartValue = scan.nextInt();
        int primiumMembership = scan.nextInt();

        if(cartValue > 999 || primiumMembership == 1){
            System.out.println("Free Shipping");
        }else{
            System.out.println("Shipping Charges Appiled");
        }
    }
}
