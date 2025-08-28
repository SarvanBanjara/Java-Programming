package Loops;

// Question: Write a Java program to convert a binay number into its decimal equivalent without using string.
// Example:
// Input:  1010
// Output: 10
// Input:  11001
// Output: 25

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary no : ");
        long n = sc.nextLong();
        int p=1,d=0;
        while(n>0){
            d+= (n%10)*p;
            n/=10;
            p*=2;

        }
        System.out.print("The decimal no is : "+d);
        
        sc.close();
    }
}
