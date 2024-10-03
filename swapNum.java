// import java.util.*;
// public class swapNum {
//     public static void swap(int a,int b){
//         a = a+b;
//         b = a-b;
//         a = a-b;
//         System.out.println("After Swap: "+"a = "+a+","+"b = "+b);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=2,b=3;
//         System.out.println("Before Swap: "+"a = "+a+","+"b = "+b);
//         swap(a,b);
//     }
// }
import java.util.*;
public class swapNum {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: "+"a = "+a+","+"b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=2,b=3;
        System.out.println("Before Swap: "+"a = "+a+","+"b = "+b);
        swap(a,b);
    }
}
