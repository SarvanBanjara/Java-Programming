package Arrays_and_Strings;

// Write a program of Array left Rotation by 1 element. 
// Sample Input →n (size of array) : 5     
// Sample Input → Elements of array  :  1 2 3 4 5                                   
// Sample Output → Result ⇒ 2 3 4 5 1

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elemets of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int copy = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = copy;
        System.out.print("Array after left rotation by 1 element : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}