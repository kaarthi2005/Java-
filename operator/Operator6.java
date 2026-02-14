import java.util.Scanner;

public class Operator6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int familyincome = scan.nextInt();
        int percentage = scan.nextInt();

        if(familyincome < 200000 && percentage>=75){
            System.out.println("Granted");
        }else{
            System.out.println("Not Granted");
        }
    }
}
