import java.util.Scanner;

public class Scholarship4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the tutionfees: ");

        int tution_fees = scan.nextInt();
         System.out.println("Enter the scholarship: ");
        int scholarship = scan.nextInt();
         System.out.println("Enter the examfee: ");
        int examfee = scan.nextInt();
         System.out.println("Enter the libray: ");
        int libary = scan.nextInt();

        int scholarship_1 = (tution_fees * scholarship )/100;
        int total = tution_fees + examfee+libary - scholarship_1;

        System.out.println(total);



    }
}