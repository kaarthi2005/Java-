import java.util.Scanner;

public class Operator15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int singnal1 = scan.nextInt();
        int singnal2 = scan.nextInt();

       int val = singnal1^singnal2;
       System.out.println(val);
    scan.close();
    }
}
