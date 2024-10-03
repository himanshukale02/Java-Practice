import java .util.*;
public class Superior {

    public static int superiorEle(int[] arr, int n){
        int sup = Integer.MIN_VALUE;
        int count = 0;
        for(int i = n-1;i>=0;i--){
            if(arr[i]>sup){
                count++;
                sup = arr[i];
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = superiorEle(arr,n);
        System.out.println(result);
    }
    
}
