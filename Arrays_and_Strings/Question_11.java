package Arrays_and_Strings;

// Write a program to check whether the given array is palindrome or not

// Case 1 : 
// Sample Input →n (size of array) : 4                             
// Sample Input → Elements of array  :  1 2 2 1         
// Sample Output → Yes its a Palindromic Array  

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean palindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                palindrome=false;
                break;

            }
        }
        if(palindrome){
            System.out.print("Yes it is Palindromic Array");

        }
        else{System.out.print("No it is not Palindromic Array.");}

        sc.close();
    }
}