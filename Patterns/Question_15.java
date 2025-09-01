package Patterns;

//         *

//       * *
//     * * *
//   * * * *
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            n++;
        }
        for (int row = 1; row <= n; row++) {
            if (row <= (n / 2) + 1) {
                for (int col = 1; col <= n - row; col++) {
                    System.out.print("  ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }

            } 
            else {
                for (int col = 1; col <= row-1; col++) {
                    System.out.print("  ");
                }
                for (int col = 1; col <=n-row+1; col++) {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }

        sc.close();
    }
}