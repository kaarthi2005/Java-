import java.util.*;

public class Factory8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rod count per hour: ");
        int rod_perhour = scan.nextInt();
         System.out.println("Enter the total Working hours: ");
        int hours_worked =scan.nextInt();
         System.out.println("Enter the overtime rod : ");
        int overtime_rod = scan.nextInt();
        System.out.println("Enter the rejected rod: ");
        int rejected_rod = scan.nextInt();


        int total_rodperhour = rod_perhour * hours_worked;
        int total_rod = total_rodperhour+overtime_rod-rejected_rod;

        System.out.println(total_rod);
    }
}
