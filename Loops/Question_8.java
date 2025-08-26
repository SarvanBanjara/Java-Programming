package Loops;

//Write a program to sum of digits of a number

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt(), sum = 0, copy = n;
        while (copy > 0) {
            sum += copy % 10;
            copy /= 10;
        }
        System.out.print("Sum of digits of " + n + " is " + sum);

        sc.close();

    }
}