import java.util.*;
public class probelm13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Yeild per acres: ");
        int yelidper_acre = scan.nextInt();
        System.out.println("Enter a Acres: ");
        int acres = scan.nextInt();
        System.out.println("Enter a extra yeild: ");
        int extrayeild = scan.nextInt();
        System.out.println("Enter a Damaged Crops: ");
        int damagedCrops = scan.nextInt();


        int total = (yelidper_acre*acres)+extrayeild-damagedCrops;

        System.out.println(total);
    }
}
