import java.util.Scanner;

public class String20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String camelStr = sc.nextLine();

        StringBuilder snakeStr = new StringBuilder();

        for (int i = 0; i < camelStr.length(); i++) {
            char c = camelStr.charAt(i);

            if (Character.isUpperCase(c)) {
                snakeStr.append("_");
                snakeStr.append(Character.toLowerCase(c));
            } else {
                snakeStr.append(c);
            }
        }

        System.out.println("CamelCase: " + camelStr);
        System.out.println("SnakeCase: " + snakeStr.toString());
        sc.close();
    }
}