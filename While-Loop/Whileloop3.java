import java.util.Scanner;

public class Whileloop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = scan.nextInt();
        boolean flag = true;
        int count =0 ;
        while(flag){
            count++;
            int guesses = scan.nextInt();
            System.out.println("Guess the number (1100): "+guesses);
            if(secretNumber == guesses){
                System.out.println("Correct! Attempts: "+count);
            }else if(secretNumber > guesses){
                System.out.println("Too low!");
            }else if(secretNumber < guesses){
                System.out.println("Too High!");
            }
        }
        scan.close();
    }
}
