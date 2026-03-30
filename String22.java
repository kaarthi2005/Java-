import java.util.*;

public class String22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        System.out.println("IP Validation:");

        for (int i = 1; i <= n; i++) {
            String ip = sc.nextLine();
            String[] parts = ip.split("\\.");
            boolean valid = true;

            if (parts.length != 4) {
                valid = false;
            } else {
                for (String part : parts) {
                    if (part.length() == 0) {
                        valid = false;
                        break;
                    }

                    for (char c : part.toCharArray()) {
                        if (!Character.isDigit(c)) {
                            valid = false;
                            break;
                        }
                    }

                    if (!valid) break;

                    if (part.length() > 1 && part.startsWith("0")) {
                        valid = false;
                        break;
                    }

                    try {
                        int num = Integer.parseInt(part);
                        if (num < 0 || num > 255) {
                            valid = false;
                            break;
                        }
                    } catch (Exception e) {
                        valid = false;
                        break;
                    }
                }
            }

            System.out.println(i + ". " + ip + " -> " + (valid ? "Valid" : "Invalid"));
        }

        sc.close();
    }
}