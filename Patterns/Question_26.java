package Patterns;

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            int input = 1;
            if (row % 2 == 0) {
                input = 0;
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(input);
                input=1-input;
            }
            System.out.println();
        }

        sc.close();
    }
}