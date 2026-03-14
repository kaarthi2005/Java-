import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        System.out.println("Password Analysis:");

        for (int i = 1; i <= n; i++) {

            String password = scan.nextLine();

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            for (int j = 0; j < password.length(); j++) {
                char ch = password.charAt(j);

                if (Character.isUpperCase(ch))
                    hasUpper = true;
                else if (Character.isLowerCase(ch))
                    hasLower = true;
                else if (Character.isDigit(ch))
                    hasDigit = true;
                else if ("!@$%^&".indexOf(ch) != -1)
                    hasSpecial = true;
            }

            String reason = "";

            if (password.length() < 8)
                reason += "Length < 8, ";
            if (!hasUpper)
                reason += "Missing upper, ";
            if (!hasLower)
                reason += "Missing lower, ";
            if (!hasDigit)
                reason += "Missing digit, ";
            if (!hasSpecial)
                reason += "Missing special, ";

            if (reason.equals("")) {
                System.out.println(i + ". " + password + " - Strong");
            } else {
                reason = reason.substring(0, reason.length() - 2);
                System.out.println(i + ". " + password + " - Weak (" + reason + ")");
            }
        }

        scan.close();
    }
}