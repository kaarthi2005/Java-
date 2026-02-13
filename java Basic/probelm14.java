import java.util.Scanner;

public class probelm14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Basesalary: ");
        int basesalary = scan.nextInt();
        System.out.println("Enter a session: ");

        int session = scan.nextInt();
        System.out.println("Enter a extra session cost: ");

        int paysession_percost = scan.nextInt();
        System.out.println("Enter a bouns: ");

        int bouns = scan.nextInt();
        System.out.println("Enter a maintainence: ");

        int maintainance = scan.nextInt();

        int total = basesalary + (session*paysession_percost) + bouns - maintainance;

        System.err.println(total);
    }
}

