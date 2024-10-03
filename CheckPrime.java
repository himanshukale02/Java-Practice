import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if(isPrime(sc.nextInt())){
        //     System.out.println("Prime");
        // }else
        //     System.out.println("Not Prime");
        System.out.println(isPrime(sc.nextInt()));
    }
}
