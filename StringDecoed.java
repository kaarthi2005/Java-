import java.util.*;

public class Main{
    public static String todecoded(String s){
        int i = 0;
        int num = 0;
        String current = "";
        Stack <String> str = new Stack<>();
        Stack <Integer> count = new Stack<>();
        String val = "";
        int a = -1  ;
        while(i<s.length()){
             
            char ch = s.charAt(i);
            if(ch >='0' && ch <= '9'){
                num = num*10+ch-'0';
                a = 1;
            }else{
                    if(a == 1){
                        a = 0;
                        count.push(num);
                        num = 0;
                        int temp = count.pop();
                        String preview = str.pop();
                        for(int j=0;j<temp;j++){
                                current += preview;
                            }
                }
                if((ch >= 'A' && ch <= 'Z') || (ch >='a' && ch <= 'z')){
                    val += ch;
                    str.push(val);
                    val = "";
                }
            }
            
            if(i == s.length()-1){
                 a = 0;
                        count.push(num);
                        num = 0;
                        int temp = count.pop();
                        String preview = str.pop();
                        for(int j=0;j<temp;j++){
                                current += preview;
                            }
            }
            
            i++;
        }
        return current;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print(todecoded(scan.next()));
    }
}
