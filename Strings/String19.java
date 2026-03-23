import java.util.*;

public class String19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        String prefix = "";
        if (n > 0) {
            prefix = words[0];

            for (int i = 1; i < n; i++) {
                while (!words[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        break;
                    }
                }
            }
        }

        System.out.print("Strings: [");
        for (int i = 0; i < n; i++) {
            System.out.print(words[i]);
            if (i != n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        if (prefix.isEmpty()) {
            System.out.println("Longest Common Prefix: (empty)");
        } else {
            System.out.println("Longest Common Prefix: " + prefix);
        }

        sc.close();
    }
}