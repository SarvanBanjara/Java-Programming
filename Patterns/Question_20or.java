package Patterns;

//        1
//       212
//      32123
//     4321234
//    543212345
//used two loops for prining the digits 

import java.util.Scanner;

public class Question_20or {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            // printing spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            

            // printing no for row to one
            for (int col = row; col >=1; col--) {
                System.out.print(col);
            }

            // printing no from 1 to row
            

            for (int col = 1; col <= row - 1; col++) {

                System.out.print(col+1);

            }

            System.out.println();

        }

        sc.close();
    }

}