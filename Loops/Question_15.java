package Loops;

//Write a  program to check whether a given number is a 'Perfect' number or not. 
//[ Explanation : A number whose sum of factors(excluding number itself) is equal to  itself  ]                                              

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (n == sum) {
            System.out.print("Perfect Number.");
        } else {
            System.out.print("Not Perfect Number");
        }

        sc.close();
    }
}
