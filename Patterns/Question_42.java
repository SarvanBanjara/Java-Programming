package Patterns;

// *       *
//  *     *
//   *   *
//    * *
//     *
//    * *
//   *   *
//  *     *
// *       *


import java.util.Scanner;

public class Question_42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            n++;
        }
        for (int row = 1; row <= n; row++) {
            // printing

            for (int col = 1; col <= n; col++) {
                if (col == row || col == n + 1 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
