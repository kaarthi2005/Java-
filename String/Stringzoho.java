import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.print(decoded(s));
    }
    public static String decoded(String s){
         Stack<Integer> count = new Stack<>();
         Stack<String> str    = new Stack<>();
         
         String current = "";
         int num =0;
         for(int i=0;i<s.length();i++){
             char ch = s.charAt(i);
             if(ch >='0' && ch<='9'){
                 num = num*10 + ch-'0';
             }else if(ch == '['){
                 count.push(num);
                 str.push(current);
                 num = 0;
                 current ="";
             }else if(ch == ']'){
                 int repeat = count.pop();
                 String preview = str.pop();
                 String temp = "";
                 for(int j=0;j<repeat;j++){
                     temp += current;
                 }
                 current = preview+temp;
             }
             else{
                 current = current+ch;
             }
         }
         return current;
    }
}
