import java.util.*;
public class Whitespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.replaceAll("\\s+", "");
        System.out.println(str.replaceAll("\\s+", ""));
    }
}
