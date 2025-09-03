package Patterns;

//     1
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5

import java.util.Scanner;

public class Question_39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            // printing spaces
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" ");
            }
            // printing pattern
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}