package Arrays_and_Strings;

// Write a program to perform Binary Search on sorted  array If element found print the index else -1
// Sample Input → n (size of array) : 5                                       
// Sample Input → Elements of array  :  1 2 3 4 5                
// Sample Input → K (Element you want to search) : 5                                                      
// Sample Output → 5 found at 4 index 

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of sorted array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search : ");
        int k = sc.nextInt();
        int l = 0, h = n - 1,index=-1;

        while (l <= h) {
            int m=(l+h)/2;
            if (arr[m] == k) {
                index=m;
                break;
            } else if (arr[m] < k) {
                l = m + 1;
                
            }
            else{
                h=m-1;
            }
        }
        if(index==-1){
            System.out.printf("%d not found in array",k);

        }
        else{
            System.out.printf("%d found at %d index",k,index);
        }

        sc.close();
    }
}