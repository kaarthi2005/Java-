import java.util.Scanner;

public class Operator8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();
        int idProff = scan.nextInt();

        if(age >= 18 && idProff==1){
            System.out.println("Entery Allowed");
        }else{
            System.out.println("Entry Denied");
        }
    }
}
