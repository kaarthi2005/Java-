import java.util.*;

public class String15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        System.out.println("Cleaned Text:");
        
        for (int i = 1; i <= n; i++) {
            String text = sc.nextLine();
            text = text.toLowerCase();
            text = text.replaceAll("[^a-z0-9 ]", "");
            text = text.replaceAll("\\s+", " ");
            text = text.trim();
            
            System.out.println(i + ". " + text);
        }
        
        sc.close();
    }
}