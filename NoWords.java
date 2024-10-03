import java.util.*;
public class NoWords {
    public static int noOfWords(String str){
        int n = str.length();
        char space = ' ';
        int count=1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)== space){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(noOfWords(str));
    }
}
