package Patterns;

// * * * * *
//   * * * *
//     * * *
//       * *
//         *

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of pattern : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
