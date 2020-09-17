import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] newArr = new int[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.arraycopy(arr, 0, newArr, 1, size - 1);
        newArr[0] = arr[arr.length - 1];
        for (int num: newArr) {
            System.out.print(num + " ");
        }
    }
}