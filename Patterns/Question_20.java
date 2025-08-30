package Patterns;

//        1
//       212
//      32123
//     4321234
//    543212345
//used single loops for printing the digits

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            // printing spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // printing row pattern
            int input = row, direction = -1;

            for (int col = 1; col <= (row * 2) - 1; col++) {
                if (direction == -1) {
                    System.out.print(input--);
                } else {
                    System.out.print(++input);

                }
                if (input == 0) {
                    direction = 1;
                    input++;
                }

            }

            System.out.println();

        }

        sc.close();
    }

}