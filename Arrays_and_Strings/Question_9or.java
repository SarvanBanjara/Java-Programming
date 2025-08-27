package Arrays_and_Strings;

// Write a program of Array left rotation by K elements without creating extra array  
// Sample Input →n (size of array) : 5     
// Sample Input → Elements of array  :  1 2 3 4 5
// Sample Input → K : 3                                     
// Sample Output → Result ⇒ 4 5 1 2 3

import java.util.Scanner;

public class Question_9or {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("K : ");
        int k =sc.nextInt(),kcopy=k;
        k=k%n;

        

        //yha pr reverse logic lagate h dekho suppose 5 element ka array h 2 baar rotate krna h to phle hum shuru ke 2 element reverse krenge aur phir baaki ke aur ab pure array ko reverse kr denege (logic ye h maan lo 2 elements ko shift krna h shuru se agr 2 ko shift kre ko last me vo 2 element ayenge  to hum shuru ke do ko reverse kr rhe taaki jb pura array reverse ho to vo 2 element  last me reverse hone ke baad shi postion me honge same with other elements.)


        // k elements ka reverse
        int start=0,end=k-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        // baaki ke elements ka reverse
          start=k;end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        // pura rray reverse
        start=0;end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }



        //printing array
        System.out.printf("Array after %d left rotation is : ",kcopy);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }









        sc.close();
    }
}