import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int checkNum = sc.nextInt();
        int count = 0;
        for (int num: arr) {
            if (num == checkNum) {
                count++;
            }
        }
        System.out.println(count);
    }
}