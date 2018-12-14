import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else if (n % 2 == 0 && (n >= 2 && n < 6) || n > 20) {
            ans = "Not Weird";

        } else {
            ans = "Weird";
        }

        sc.close();
        System.out.println(ans);

    }
}