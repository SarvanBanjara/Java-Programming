package Patterns;

// *       *
// * *   * *
// * * * * *
// * *   * *
// *       *

// ussing three partition

import java.util.Scanner;

public class Question_16or {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt(), mid = (n + 1) / 2;
        if (n % 2 == 0) {
            n--;
        }
        for (int row = 1; row <= n; row++) {
            int stars = 0;
            if (row < mid) {
                stars = row;
            } else if (row == mid) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("* ");
                    
                }
                System.out.println();
                continue;
            
            } else {
                stars = n - row + 1;
            }

            int space = n - (stars * 2);
            // stars
            for (int col = 1; col <= stars; col++) {
                System.out.print("* ");
            }
            // spaces
            for (int col = 1; col <= space; col++) {
                System.out.print("  ");
            }
            // stars
            for (int col = 1; col <= stars; col++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        sc.close();
    }
}
