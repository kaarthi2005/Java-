import java.util.*;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        int validCount = 0;
        int invalidCount = 0;

        System.out.println("Email Validation Results:");

        for (int i = 1; i <= n; i++) {
            String email = sc.nextLine();
            boolean isValid = true;

            int atIndex = email.indexOf('@');
            int lastAtIndex = email.lastIndexOf('@');
            if (atIndex == -1 || atIndex != lastAtIndex) {
                isValid = false;
            }
            else if (atIndex == 0 || atIndex == email.length() - 1) {
                isValid = false;
            }
            else if (email.startsWith(".") || email.endsWith(".")) {
                isValid = false;
            }
            else {
                int dotIndex = email.indexOf('.', atIndex);
                if (dotIndex == -1 || dotIndex == email.length() - 1) {
                    isValid = false;
                }
            }
            if (isValid) {
                System.out.println(i + ". " + email + " - Valid");
                validCount++;
            } else {
                System.out.println(i + ". " + email + " - Invalid");
                invalidCount++;
            }
        }

        System.out.println("Total Valid: " + validCount);
        System.out.println("Total Invalid: " + invalidCount);

        sc.close();
    }
}
