import java.util.Scanner;

public class Operator10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int unitConsumed = scan.nextInt();
        int voltageFluctuation = scan.nextInt();

        if(unitConsumed > 500  || voltageFluctuation == 1){
            System.out.println("Alert");
        }else{
            System.out.println("Normal");
        }
    scan.close();
    }
}
