package Loops;

// Write a program to check whether a given number is an Armstrong number or
// not.
// [ Explanation : Sum of cube of all digits will be equal to itself]
// [ For e.g 407 , Sum of cube of digits ⇒ 4^3 + 0^3 + 7^3 ⇒ 64 + 0 + 343 ⇒ 407]

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt(), copy = n, sum = 0;
        while (copy > 0) {
            int temp = copy % 10;
            sum += (temp * temp * temp);
            copy /= 10;

        }
        if (sum == n) {
            System.out.print("Armstrong Number");
        } else {
            System.out.print("Not Armstrong Number");

        }

        sc.close();
    }
}
