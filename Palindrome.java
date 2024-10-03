import java.util.*;
public class Palindrome {

    public static String isPalindrome(String str){
        int n = str.length();
        int i = 0;
        int j = n-1;

        while(i<j){
            if(str.charAt(i)!= str.charAt(j)){
                return "false";
            }
            i++;
            j--;
        }

        return "true";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
