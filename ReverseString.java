import java.util.*;
public class ReverseString {

    public static String reverseS(String name){
        String reverse = "";
        char ch;
        for(int i=0;i<name.length();i++){
            ch = name.charAt(i);
            reverse =ch + reverse;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseS(str));
    }
}
