import java.util.*;

public class String18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        StringBuilder encrypted = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                char newChar = (char) ((ch - 'A' + 3) % 26 + 'A');
                encrypted.append(newChar);
            } else if (ch >= 'a' && ch <= 'z') {
                char newChar = (char) ((ch - 'a' + 3) % 26 + 'a');
                encrypted.append(newChar);
            } else {
                encrypted.append(ch);
            }
        }

        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + encrypted.toString());

        sc.close();
    }
}
