package Patterns;

//     1
//    121
//   12321
//  1234321
// 123454321

import java.util.Scanner;

public class Question_30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            // printing spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");

            }

            // printing pattern
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for(int col=1;col<row;col++){
                System.out.print(row-col);
                
            }
            System.out.println();

        }

        sc.close();
    }
}
