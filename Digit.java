import java.util.*;
public class Digit {

    public static int singleD(int num){

        while(num>9){
            if(num%2!=0){
                num/=2;
            }else{
                num = (num-2)/2;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = singleD(num);
        System.out.println(result);
    }
    
}
