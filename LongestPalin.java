import java.util.*;
public class LongestPalin {
    public static String LongestPalindrome(String str){
        int n = str.length();
        if(n<=1) return str;
        int st=0;
        int max_len=1;
        for(int i=0;i<n;i++){
            int l =i, r =i;
            while(l>=0 && r<n){
                if(str.charAt(l)==str.charAt(r)){
                    l--;
                    r++;
                }else{
                    break;
                }         
            }
            int len = r-l-1;
            if(len>max_len){
                max_len=len;
                st = l+1;
            }
        }
        for(int i=0;i<n-1;i++){
            int l =i, r =i+1;
            while(l>=0 && r<n &&str.charAt(l)==str.charAt(r)){
                l--;
                r++;
            }
            int len = r-l-1;
            if(max_len<len){
                max_len=len;
                st = l+1;
            }
        }
        return str.substring(st, st+max_len);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = LongestPalindrome(str);
        System.out.println(result);
    }
}
