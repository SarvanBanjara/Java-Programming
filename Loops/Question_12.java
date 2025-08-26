package Loops;

//Write a  program to find the HCF (GCD) of two numbers

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ; ");
        int a = sc.nextInt();
        System.out.print("Enter b ; ");
        int b = sc.nextInt();
        int x = a, y = b;
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        System.out.printf("The HCF of %d and %d is %d", x, y, a);

        sc.close();
    }
}
