package Arrays_and_Strings;

// Write a program  to find the largest element of an array and print its index.
// Sample Input →n (size of array) : 5     
// Sample Input → Elements of array  :  7 27 12 19 3                                   
// Sample Output → 27 is largest element and its index is 1

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0], index = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.printf("%d is the largest element and its index is %d", max, index);

        sc.close();
    }
}