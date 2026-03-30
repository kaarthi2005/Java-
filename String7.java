import java.util.*;
public class String7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Flight Details:");

        for (int i = 1; i <= n; i++) {
            String flightCode = scanner.nextLine();

            String[] parts = flightCode.split("-");

            String firstPart = parts[0];
            String origin = parts[1];
            String destination = parts[2];

            String airline = "";
            String flightNumber = "";

            for (char ch : firstPart.toCharArray()) {
                if (Character.isLetter(ch)) {
                    airline += ch;
                } else if (Character.isDigit(ch)) {
                    flightNumber += ch;
                }
            }

            System.out.println(i + ". Airline: " + airline + ", Flight: " + flightNumber +
                    ", From: " + origin + ", To: " + destination);
        }

        scanner.close();
    }
}