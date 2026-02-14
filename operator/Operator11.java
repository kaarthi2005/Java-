import java.util.Scanner;

public class Operator11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int baseBoxes = scan.nextInt();
        int level = scan.nextInt();

        int total_Capacity = baseBoxes<<level ;
        System.out.println(total_Capacity);
    scan.close();
    }
}

