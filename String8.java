import java.util.*;

public class String8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Anagram Check:");

        for (int i = 1; i <= n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                System.out.println(i + ". " + str1 + " & " + str2 + " -> Anagram");
            } else {
                System.out.println(i + ". " + str1 + " & " + str2 + " -> Not Anagram");
            }
        }

        sc.close();
    }
}
