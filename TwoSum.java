import java.util.*;
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int result=0;
        int[] index = new int[2];
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                result = nums[i]+nums[j];
                if(result==target){
                    index[0]=i;
                    index[1]=j;
                    break;
                }
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int[] index = twoSum(arr,target);
        for(int i=0;i<2;i++){
            System.out.print(index[i]);
        }

    }
}