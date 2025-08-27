package Arrays_and_Strings;

// Write a program of Array right rotation by K elements without creating extra array.
// Sample Input →n (size of array) : 5     
// Sample Input → Elements of array  :  1 2 3 4 5
// Sample Input → K : 3                                     
// Sample Output → Result ⇒ 3 4 5 1 2


import java.util.Scanner;
public class Question_10or {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("K : ");
        int k =sc.nextInt(),kcopy=k;
        k=k%n;

        //yha vi same reverse logic lagate h bs left me aage ke elements handle kr rhe the ab peeche ke krenge 

        //reverse last k elements;
        int start=n-k,end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        //reverse bache n-k elements;
        start=0;end=n-k-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        //reverse array;
        start=0;end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.printf("Array After %d right rotation is : ",kcopy);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }

        






        
        
        sc.close();
    }
}