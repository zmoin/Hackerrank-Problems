import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //new scanner
        Scanner scan = new Scanner(System.in);
        //scan the next inpu
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

       //printing in reverse order
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
