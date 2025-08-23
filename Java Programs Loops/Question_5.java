//Write a program to print the power of a raised to the power of b.

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int square = 1;
        for (int i = 1; i <= b; i++) {
            square *= a;
        }
        System.out.print("a^b = " + square);

        sc.close();

    }
}