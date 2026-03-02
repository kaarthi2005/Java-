import java.util.Scanner;

public class Whileloop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String correctPassword = scan.nextLine();
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("Enter password:");
            String userInput = scan.nextLine();
            if (userInput.equals(correctPassword)) {
                System.out.println("Access granted!");
                break;
            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println("Account locked!");
                } else {
                    System.out.println("Incorrect! Attempts remaining: " + attempts);
                }
            }
        }

        scan.close();
    }
}
