import java.util.Scanner;

public class String5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("URL Analysis:");

        for (int i = 1; i <= n; i++) {

            String url = sc.nextLine();
            if (url.startsWith("http://")) {
                url = url.substring(7);
            } else if (url.startsWith("https://")) {
                url = url.substring(8);
            } else if (url.startsWith("ftp://")) {
                url = url.substring(6);
            }
            if (url.startsWith("www.")) {
                url = url.substring(4);
            }
            String domain = "";

            for (int j = 0; j < url.length(); j++) {
                char ch = url.charAt(j);

                if (ch == '/' || ch == ':' || ch == '?') {
                    break;
                }

                domain = domain + ch;
            }

            System.out.println(i + ". " + url + " -> Domain: " + domain);
        }

        sc.close();
    }
}