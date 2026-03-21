import java.util.*;
import java.util.regex.*;

public class String14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keyword = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Highlighted Text:");
        Pattern pattern = Pattern.compile("(?i)" + Pattern.quote(keyword));

        for (int i = 1; i <= n; i++) {
            String sentence = sc.nextLine();

            Matcher matcher = pattern.matcher(sentence);
            String result = matcher.replaceAll("<b>$0</b>");

            System.out.println(i + ". " + result);
        }

        sc.close();
    }
}