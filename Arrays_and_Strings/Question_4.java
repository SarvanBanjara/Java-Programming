package Arrays_and_Strings;

// Write a program to perform Linear Search on an array - If element found print the index else -1
// Case 1 :
// Sample Input → n (size of array) : 5                                       
// Sample Input → Elements of array  :  1 2 3 4 5                
// Sample Input → K (Element you wan to search) : 3                                                      
// Sample Output → 3 found at 2 index  

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search : ");
        int k = sc.nextInt(), index = -1;
        for (int j = 0; j < n; j++) {
            if (arr[j] == k) {
                index = j;
                break;

            }
        }
        if (index == -1) {
            System.out.printf("%d not found in array.", k);
        } else {
            System.out.printf("Element %d found at %d index.", k, index);
        }

        sc.close();
    }
}
