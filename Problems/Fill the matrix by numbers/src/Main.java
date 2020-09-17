import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = Math.abs(j - i);

                }
            }
        }
        for (int[] dim2Array : arr) {
            for (int vector : dim2Array) {
                System.out.print(vector + " ");
            }
            System.out.println();
        }
    }
}