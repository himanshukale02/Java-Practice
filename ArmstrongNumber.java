import java.util.*;
public class ArmstrongNumber {
    public static boolean isArm(int num){
        int number = num;
        int result = 0,remain,n=0;
        while(number!=0){
            remain = number%10;
            number /= 10;
            ++n;
        }
        number = num;
        while(number!=0){
            remain = number%10;
            number /= 10;
            result += Math.pow(remain, n);
        }
        if(result==num){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isArm(sc.nextInt()));
    }
}
