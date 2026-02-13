import java.util.*;

public class DailywagesSalary7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the worked Days: ");
        int dayworked = scan.nextInt();
        System.out.println("Enter the wagePerDay: ");
        int wagePerDay = scan.nextInt();
        System.out.println("Enter the overtimeBonus: ");
        int overtimeBonus = scan.nextInt();
        System.out.println("Enter the Maintain charge: ");
        int maintaincharge = scan.nextInt();

        int salary = dayworked*wagePerDay;
        int total = salary+overtimeBonus-maintaincharge;

        System.out.println(total);
    }
}
