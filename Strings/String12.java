import java.util.*;

public class String12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Parsed Fields:");

        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine();

            List<String> fields = new ArrayList<>();
            StringBuilder current = new StringBuilder();
            boolean inQuotes = false;

            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);

                if (ch == '"') {
                    if (inQuotes && j + 1 < line.length() && line.charAt(j + 1) == '"') {
                        current.append("\"");
                        j++;
                    } else {
                        inQuotes = !inQuotes;
                        current.append(ch);
                    }
                } else if (ch == ',' && !inQuotes) {
                    fields.add(current.toString().trim());
                    current.setLength(0);
                } else {
                    current.append(ch);
                }
            }

            fields.add(current.toString().trim());
            System.out.println(i + ". " + fields);
        }

        sc.close();
    }
}
