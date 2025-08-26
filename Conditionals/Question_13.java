package Conditionals;

//Write a program to find the largest among three numbers

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        sc.close();
        if (a > b && a > c) {
            System.out.print("a = " + a + " is largest.");

        } else if (b > a && b > c) {
            System.out.print("b = " + b + " is largest.");

        } else if (c > a && c > b) {
            System.out.print("c = " + c + " is largest.");
        } else {
            System.out.print("Invalid Input");
        }

    }
}