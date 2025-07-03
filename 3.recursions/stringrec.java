

import java.util.Scanner;

public class stringrec {
    static void palindrome(String s, int idx){
        if(idx == s.length()){
            System.out.println("yes it is palindrome ");
        }
        String smallans = reverse(s, idx+1);
        String w = smallans + s.charAt(idx);
        if(w.equals(s)){
            System.out.println("Yes this is a palindrone string");
                   
        }else{
            System.out.println("NO, It is not a palindrome");
        }
    }

    static String reverse(String s, int idx){
        if(idx == s.length()) return "";
        String smallans = reverse(s, idx+1);
        return smallans + s.charAt(idx);
    }
    
    static String removeA(String s, int idx){
        if(idx == s.length()) return "";
        String smallans = removeA(s, idx+1);
        char w = s.charAt(idx);
        if(w != 'a'){
            return w+smallans;
        }else{
            return smallans;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //System.out.println(s.substring(1));
        //System.out.println(s.substring(2,4));
        System.out.println("Removed all A: "+removeA(s, 0));
        System.out.println("Reversed the string: "+reverse(s, 0));
        palindrome(s, 0);
    }
}
