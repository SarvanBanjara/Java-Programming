package Loops;

// Question: Write a Java program to convert a decimal number to binary 
// without using inbuilt methods and string algorithm.
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
        System.out.print("Enter the Decimal no. : ");
        int d= sc.nextInt();
        int b=0,p=1;

        
        while(d>0){

            b+=(d%2)*p;
            
            d/=2;
            p*=10;
            
        }
        System.out.print("The binary no. is : "+b);
        
        
        sc.close();
    }
}