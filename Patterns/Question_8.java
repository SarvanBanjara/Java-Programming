package Patterns;

//   *
//   * *
//   *   *
//   *     *
//   * * * * *

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of triangle : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1 || i == 5) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}