import java.util.*;
public class DecimalBinary {
    public static void toBinary(int num){
        int[] binary = new int[1000];
        int i=0;
        while(num>0){
            binary[i] = num%2;
            num = num/2;
            i++;
        }
        for(int j = i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        toBinary(sc.nextInt());
    }
}
