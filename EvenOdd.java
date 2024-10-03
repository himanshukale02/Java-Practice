import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else 
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isEven(sc.nextInt()));
    }
}
