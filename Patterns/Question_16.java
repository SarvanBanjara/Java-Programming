package Patterns;

// *       *
// * *   * *
// * * * * *
// * *   * *
// *       *

// ussing three partition

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt(), mid = (n + 1) / 2;
        if (n % 2 == 0) {
            n--;
        }
        for (int row = 1; row < mid; row++) {
            // printing stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // printing spaces
            for (int col = 1; col <= n - (row * 2); col++) {
                System.out.print("  ");
            }
            // printing stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int col = 1; col <= n; col++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int row = 1; row < mid; row++) {
            // printing stars
            for (int col = 1; col <= mid - row; col++) {
                System.out.print("* ");
            }
            // printing spaces
            for (int col = 1; col <= (row*2)-1 ; col++) {
                System.out.print("  ");
            }
            // printing stars
            for (int col = 1; col <= mid - row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        sc.close();
    }
}
