import java.util.Scanner;

public class Whileloop23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int i = 0;
        int count = 0;
        str = str.toLowerCase();
            do{
                char ch = str.charAt(i);

                if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                    count++;
                }i++;
            }while(str.length()>i);

            System.out.println("Text: " + str);
            System.out.println("Vowel count: " + count);
       
            scan.close();
    }
}
