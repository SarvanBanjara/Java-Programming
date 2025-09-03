package Patterns;

//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

import java.util.Scanner;

public class Question_40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            int input=65;
            // printing spaces
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" ");
            }
            // printing stars
            for (int col = 1; col <= row; col++) {
                System.out.printf("%c",input++);
            }
            input--;
            // priting half concatinated stars
            for (int col = 1; col <= row - 1; col++) {
                System.out.printf("%c",--input);
            }
            System.out.println();

        }

        sc.close();
    }
}