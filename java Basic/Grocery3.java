import java.util.*;
public class Grocery3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Sales amount: ");
        int sales =  scan.nextInt();
        System.out.println("Enter the Discount");
        int discount = scan.nextInt();
        System.out.println("Enter the GST");
        int gst = scan.nextInt();
        int cal_discount= (sales * discount )/100;
        int total_discount_amount = sales - cal_discount;
        int tax = total_discount_amount * gst/100;
        int total = total_discount_amount +tax;

        System.out.println(total);
    }
}