package Arrays_and_Strings;

//Write a program  to accept n elements  in an array and print it in normal order and in reverse order

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.print("The nomal order of array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("\nThe reverse order of array is : ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }

        sc.close();
    }
}
