import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int[] newArr = new int[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.arraycopy(arr, 0, newArr, 1, 4);
        newArr[0] = arr[arr.length - 1];
        System.out.println(Arrays.toString(newArr));
    }
}