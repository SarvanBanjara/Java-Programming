package Loops;

//  Write a program to print the multiplication table of numbers from 1 to n.

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n =sc.nextInt();
        for(int i =1 ;i<=10;i++){
            for(int j =1;j<=n;j++){
                System.out.printf("%-2d * %-2d = %-5d",i,j,i*j);
            }
            System.out.println();
        }

        
        
        sc.close();
    }
}
