import java.util.Scanner;

public class Solution {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverse(int[] arr, int src, int tar) {
        if (arr == null)
            return;
        else if (src < 0 || src >= arr.length)
            return;
        else if (tar < 0 || tar >= arr.length)
            return;
        else if (src >= tar)
            return;

        int mid = (src + tar) / 2;

        for (int i = src; i <= mid; i++) {
            int midVal = i - src;
            swap(arr, src + midVal, tar - midVal);
        }
    }

    private static void initialize(Scanner in, int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
    }

    private static int getRotations(Scanner in) {
        return in.nextInt();
    }

    private static int getSize(Scanner in) {
        return in.nextInt();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = getSize(scan);
        int rotations = getRotations(scan);

        int arr[] = new int[size];

        initialize(scan, arr, size);
        scan.close();

        rotations = rotations % size; // rotations > size
        int pos = size - rotations - 1;

        reverse(arr, 0, size - 1);
        reverse(arr, 0, pos);
        reverse(arr, pos + 1, size - 1);

        printArray(arr);
    }
}
