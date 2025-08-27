package Arrays_and_Strings;
// Write a program to perform Bubble sort on an array  

// Sample Input → n (size of array) : 8      
// Sample Input → Elements of array  :  5 3 8 4 7 1 2 6
// Sample Output → Sorted Array : 1 2 3 4 5 6 7 8 

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // i<n-1 kyuki last ke 1 elemt khud hi apne position pr hoga
        for (int i = 0; i < n - 1; i++) {
            // i<n-1-i kyuki hr baar lagest elemt apne position me hoga to usey fir sort
            // krne ki jrurat nhi
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("The sorted array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
