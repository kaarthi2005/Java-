import java.util.Scanner;

public class Operator13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int connectionValue = scan.nextInt();
        int applianceMask = scan.nextInt();

        int val = connectionValue & applianceMask;

        if(val>0){
            System.out.println("Acitve");
        }else{
            System.out.println("Inactive");
        }
    scan.close();
    }
}
