import java.util.*;
public class SumXOR {
    public static int sumXor(int[] arr, int n){
        int sum=0;
        int xor=0;
        for(int i = 0;i<n;i++){
            if (i%2==0) {
                xor=xor^arr[i];
            }else{
                sum = sum + arr[i];
                //sum+=arr[i];
            }
        }
        return sum - xor;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result=sumXor(arr,n);
        System.out.println(result);
    }
}
