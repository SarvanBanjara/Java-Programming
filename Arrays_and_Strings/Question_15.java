package Arrays_and_Strings;

// Write a program to find the second largest element in an array (without sorting).
// Input: n = 6, Array = 10 20 5 8 50 30
// Output: Second largest element is 30

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = 0, secondlargest = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] > secondlargest) && (arr[i] > largest)) {
                secondlargest=largest;
                largest = arr[i];
            } else if ((arr[i] < largest) && (arr[i] > secondlargest)) {
                secondlargest = arr[i];
            }
        }
        System.out.printf("The Second largest element in array is %d", secondlargest);

        sc.close();
    }
}