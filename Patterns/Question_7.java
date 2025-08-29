package Patterns;
//       *
//      ***
//     *****
//    *******
//   *********

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of trangle : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // printing starts
            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}