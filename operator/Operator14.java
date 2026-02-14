import java.util.Scanner;

public class Operator14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int permissionA = scan.nextInt();
        int permissionB = scan.nextInt();

       int val = permissionA | permissionB;
       System.out.println(val);
    scan.close();
    }
}
