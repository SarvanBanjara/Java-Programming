package Arrays_and_Strings;

// to print in array 1 3 5 7 9 8 6 4 2 

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // placing odd no then even

        
        for (int i = 0; i < n; i++) {
            if (i < (n + 1) / 2) {
                arr[i] = 2*i+1;
                

            } else {
                arr[i]=2*(n-i);

            }

        }

        System.out.print("The array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
