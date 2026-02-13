import java.util.*;

public class Billing2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter basecost : ");
        int basecost = scan.nextInt();
        System.out.println("Enter the ExtraGB : ");
        int extraGB = scan.nextInt();
        System.out.println("Enter the rateperGb: ");
        int rateperGb = scan.nextInt();
        System.out.println("Enter the Tax : "); 
        int tax = scan.nextInt();

        int sum = basecost +(extraGB * rateperGb);
        float taxx = sum * tax /100.0f;
        float total = taxx+sum;
        System.out.println(total);
    }
}
