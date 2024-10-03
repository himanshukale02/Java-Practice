import java.util.*;
public class ReverseNumber {
    public static int reverseNum(int num){
        int reverse = 0;
        while(num!=0){
            reverse = reverse * 10 + num % 10;
            num/=10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseNum(sc.nextInt()));
    }
}
