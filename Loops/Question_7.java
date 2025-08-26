package Loops;

//Write a program to find the prime numbers within a range of numbers

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt(), flag = 1;
        for (int i = 2; i * i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
            if (flag == 0) {
                System.out.print(n + " is not prime.");

            } else {
                System.out.print(n + " is  prime.");
            }

        }

        sc.close();

    }
}