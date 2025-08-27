package Arrays_and_Strings;

// Write a program of Array right Rotation by 1 element.
// Sample Input →n (size of array) : 5     
// Sample Input → Elements of array  :  1 2 3 4 5                                   
// Sample Output → Result ⇒ 5 1 2 3 4

import java.util.Scanner;
public class Question_8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n =sc.nextInt();
        System.out.print("Enter the elements of array : ");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lastelement=arr[n-1];
        for(int i =n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=lastelement;
        System.out.print("array after right rotation by 1 element : ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        
        sc.close();
    }
}