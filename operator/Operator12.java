import java.util.Scanner;

public class Operator12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fileSize = scan.nextInt();
        int compressinCycles = scan.nextInt();

        int size = fileSize >> compressinCycles;
        System.out.println(size);
        scan.close();
    }
}
