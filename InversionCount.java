//Inversion Count
import java.util.*;
public class InversionCount {

    public static int InversionC(int[] arr, int n){
        int i,j,count=0;
        for(i=0;i<n;i++){
            for(j=1;j<n-i;j++){
                if(arr[i]>arr[j]){
                    count += 1; 
                }
                
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = InversionC(arr, n);
        System.out.println(result);
    }
}
