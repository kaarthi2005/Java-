import java.util.*;
public class String16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] logs = new String[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String logEntry = sc.nextLine();
            if (logEntry.contains("ERROR") || logEntry.contains("EXCEPTION")) {
                logs[count] = logEntry;
                count++;
            }
        }
        System.out.println("Critical Logs:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + logs[i]);
        }
        System.out.println("Total Errors Found: " + count);
        sc.close();
    }
}