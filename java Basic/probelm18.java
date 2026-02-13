import java.util.Scanner;

public class probelm18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a amount of registeration: ");
        int reg = scan.nextInt();
        System.out.println("Enter a amount of sponsorship: ");

        int sponsor= scan.nextInt();
        System.out.println("Enter a amount of stall: ");

        int stall = scan.nextInt();
        System.out.println("Enter a amount of stage : ");

        int stage= scan.nextInt();
        System.out.println("Enter a amount of celebrity: ");

        int celebirity = scan.nextInt();

        System.out.println("Enter a amount of marketing: ");

        int marketing = scan.nextInt();

        int total = reg+sponsor+stall-stage-celebirity-marketing;

        System.out.println(total);
    }
}

