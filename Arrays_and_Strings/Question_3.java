package Arrays_and_Strings;

// Accept size n from user and create a n size array then take n inputs into the and finally
// Print the sum of all elements .  
// Sample Input → n (size of array) : 5      
// Sample Input → Elements of array  :  1 2 3 4 5
// [ Explanation : Sum of all Array Elements ⇒ 1 + 2 + 3 + 4 + 5 = 15 ]                                              
// Sample Output → Sum of all Array Elements  = 15

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.printf("Sum of all Array Elements = %d", sum);

        sc.close();
    }
}
