import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("DNA Sequence Analysis:");

        for (int i = 1; i <= n; i++) {
            String sequence = sc.nextLine();
            String original = sequence.toLowerCase();

            String reverse = "";
            for (int j = original.length() - 1; j >= 0; j--) {
                reverse += original.charAt(j);
            }

            if (original.equals(reverse)) {
                System.out.println(i + ". " + sequence + " - Palindrome");
            } else {
                System.out.println(i + ". " + sequence + " - Not Palindrome");
            }
        }

        sc.close();
    }
}