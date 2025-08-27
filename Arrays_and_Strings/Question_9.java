package Arrays_and_Strings;

// Write a program of Array left rotation by K elements.. 
// Sample Input →n (size of array) : 5     
// Sample Input → Elements of array  :  1 2 3 4 5
// Sample Input → K : 3                                     
// Sample Output → Result ⇒ 4 5 1 2 3

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("K : ");
        int k =sc.nextInt(),copyk=k;

        k=k%n;
        int[] rotatedarr=new int[n];
        int count=0;

        for(int i = k;i<n;i++){
            rotatedarr[count++]=arr[i];
        }
        for(int i =0;i<k;i++){
            rotatedarr[count++]=arr[i];
        }

        System.out.printf("Arrays after %d left rotation is : ",copyk);
        for(int i=0;i<n;i++){
            System.out.print(rotatedarr[i]+" ");
        }


        sc.close();
    }
}