import java.util.Scanner;

public class FibonacciSum {
    public static int sum(int n){
        int num1 = 0;
        int num2 = 1;
        int num3;
        int sum=num1+num2;
        System.out.print(num1+","+num2);
        for(int i=2;i<n;i++){
            num3=num1+num2;
            sum+=num3;
            System.out.print(","+num3);
            num1=num2;
            num2=num3;
        
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("\nSum = "+ sum(num));
    }
    
}
