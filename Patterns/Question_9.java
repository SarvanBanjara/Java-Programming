package Patterns;

//        *
//       ***
//      *****
//     *******
//      *****
//       ***
//        *

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of Pattern : ");
        int n = sc.nextInt();

        // Printing upper triangle

        for (int i = 1; i <= (n +1) / 2; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = ((n-1) / 2); i >=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}