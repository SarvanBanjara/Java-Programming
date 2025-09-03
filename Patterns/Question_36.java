package Patterns;

// 1 2 3 4 5
// 2 3 4 5 1
// 3 4 5 1 2
// 4 5 1 2 3
// 5 1 2 3 4

import java.util.Scanner;

public class Question_36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            int input = row;
            for (int col = 1; col <= n; col++) {
                System.out.print(((input++ - 1) % n) + 1);

            }
            System.out.println();
        }

        sc.close();
    }
}