
/*The cinema has n rows, each row consists of m seats (n and m do not exceed 20). The two-dimensional matrix stores the information on the sold tickets, number 1 means that the ticket for this place is already sold, the number 0 means that the place is available. You want to buy k tickets to the neighboring seats in the same row. Find whether it can be done.

 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] cinemaArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinemaArr[i][j] = sc.nextInt();
            }
        }
        int numbersOfTickets = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < m; j++) {
                counter = (cinemaArr[i][j] == 0)? (counter + 1) : 0;
                if (counter == numbersOfTickets) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(0);

    }
}