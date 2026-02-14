import java.util.Scanner;

public class Operator5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int salary = scan.nextInt();
        int cibil = scan.nextInt();

        if(salary > 25000 && cibil >700){
            System.out.println("Loan Approved");
        }else{
            System.out.println("Loan Rejected");
        }
    }
}
