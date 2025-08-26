package Loops;

//Write a program to print the sum of all factors of a number

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt(), fact = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                fact += i;
            }
        }
        System.out.print("Sum of factorial of " + n + " is " + (fact + n));

        sc.close();

    }
}
