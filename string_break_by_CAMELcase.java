import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int i =0;
        String current = "";
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                 ch = Character.toUpperCase(ch);
            }else{
                 ch = Character.toLowerCase(ch);
            }
           
            if(ch >='a' && ch <= 'z'){
                System.out.println(current);
                current = "";
                current += ch;
            }
            else{
                current += ch;
                if(i == s.length()-1){
                    System.out.println(current);
                }
            }
            i++;
        }
    }
}
