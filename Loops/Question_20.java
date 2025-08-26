package Loops;

// Question: Write a Java program to convert a decimal number to binary 
// without using inbuilt methods.
//
// Example:
// Input:  7
// Output: 111
//
// Input:  18
// Output: 10010

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal no . : ");
        int dc = sc.nextInt();
        int ans = 0, pow = 1;
        while (dc > 0) {
            ans += (dc % 2 * pow);
            pow *= 10;
            dc /= 2;
        }
        System.out.print("Binary equivalent = " + ans);

        sc.close();
    }
}