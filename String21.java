import java.util.*;

public class String21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Syntax Check:");

        for (int k = 1; k <= n; k++) {
            String expr = sc.nextLine();

            char[] stack = new char[expr.length()];
            int top = -1;
            boolean valid = true;

            for (int i = 0; i < expr.length(); i++) {
                char ch = expr.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack[++top] = ch;
                }
                else if (ch == ')' || ch == '}' || ch == ']') {
                    if (top == -1) {
                        valid = false;
                        break;
                    }
                    char open = stack[top--];
                    if ((ch == ')' && open != '(') ||
                        (ch == '}' && open != '{') ||
                        (ch == ']' && open != '[')) {
                        valid = false;
                        break;
                    }
                }
            }
            if (top != -1) {
                valid = false;
            }
            if (valid) {
                System.out.println(k + ". " + expr + " -> Valid");
            } else {
                System.out.println(k + ". " + expr + " -> Invalid");
            }
        }
        sc.close();
    }
}