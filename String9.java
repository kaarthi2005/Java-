import java.util.*;
public class String9 {
    public static void main(String [ ] args){
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        String str [] = new String[n];
        for(int i=0 ;i<n;i++){
            str[i] = scan.next();
        }
        for(int i=0 ;i<n ;i++){
            char ch [] = str[i].toCharArray();
            String comp ="";
            for(int j= ch.length-1;j>=0;j--){
                comp+= ch[j];
            }
            if(str[i].equalsIgnoreCase(comp)){
                System.out.println(str[i]+""+" Palindrome");
            }else{
                System.out.println(str[i]+""+" Notpalindrome");
            }
        }
        scan.close();
    }
}
