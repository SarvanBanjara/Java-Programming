package Loops;

// Question: Write a Java program to convert a binay number into its decimal equivalent.
// Example:
// Input:  1010
// Output: 10
// Input:  11001
// Output: 25

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");

        int bn = sc.nextInt();
        int ans = 0, power = 1;
        while (bn > 0) {
            ans += ((bn % 10) * power);
            bn /= 10;
            power *= 2;

        }
        System.out.printf("Decimal equivalent = %d", ans);

        sc.close();
    }
}
