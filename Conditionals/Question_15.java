package Conditionals;

//Write a program to read the age of a candidate and determine whether it is eligible
//for casting his/her own vote

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.print("Go home and watch POGO.");

        } else {
            System.out.print("You can caste the vote.");
        }
        sc.close();

    }
}