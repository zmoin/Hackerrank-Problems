import java.util.Scanner;

public class Solution {

    public static int findHourglassSum(int[][] arr, int row, int col) {
        int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col]
                + arr[row + 2][col + 1] + arr[row + 2][col + 2];
        return sum;
    }

    public static int maximumHourGlass(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int retVal = findHourglassSum(arr, i, j);
                max = Math.max(max, retVal);
            }
        }
        return max;
    }

    public static void initialize(int[][] arr, int row, int col) {
        Scanner scan = new Scanner(System.in);
        // fill in with the proper values
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        scan.close();
    }

    public static void main(String[] args) {
        // initialize a 6x6 2d int array
        int arr[][] = new int[6][6];
        initialize(arr, 6, 6);

        System.out.println(maximumHourGlass(arr));
    }
}