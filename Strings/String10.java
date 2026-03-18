import java.util.*;

public class String10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Masked Data:");

        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();

            String digits = s.replaceAll("[^0-9]", "");
            String last4 = digits.length() <= 4 ? digits : digits.substring(digits.length() - 4);

            StringBuilder result = new StringBuilder();
            int digitCount = 0;
            int totalDigits = digits.length();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (Character.isDigit(c)) {
                    if (digitCount < totalDigits - 4) {
                        result.append("*");
                    } else {
                        result.append(c);
                    }
                    digitCount++;
                } else {
                    result.append(c);
                }
            }

            if (totalDigits <= 4) {
                result = new StringBuilder(last4);
            }

            System.out.println(i + ". " + result.toString());
        }

        sc.close();
    }
}