//Maximum number of pieces by making n straight cuts
import java.util.*;
public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int pieces = 1+n*(n+1)/2;
        System.out.println(pieces);

    }
}

