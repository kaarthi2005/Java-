import java.util.Scanner;

public class Operator3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>40 && b>90){
            System.out.println("Bonus Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
