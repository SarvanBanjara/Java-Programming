package Arrays_and_Strings;

// wrte a program to reverse a array .

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //using while loop

        // int start=0,end=n-1;
        // while (start<end){
        //     int temp =arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;

        // }
        //using for loop
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }

        System.out.print("The reversed array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }





        sc.close();
    }
}