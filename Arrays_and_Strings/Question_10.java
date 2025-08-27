package Arrays_and_Strings;

// Write a program of Array right rotation by K elements. 
// Sample Input →n (size of array) : 5     
// Sample Input → Elements of array  :  1 2 3 4 5
// Sample Input → K : 3                                     
// Sample Output → Result ⇒ 3 4 5 1 2
import java.util.Scanner;

public class Question_10 {
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
        int k=sc.nextInt(),kcopy=k,index=0;
        k=k%n;
        int[] rotatedarr=new int[n];

        for(int i=n-k;i<n;i++){
            rotatedarr[index++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            rotatedarr[index++]=arr[i];

        }

        System.out.printf("Array after %d right rotation : ",kcopy);
        for(int i=0;i<n;i++){
            System.out.print(rotatedarr[i]+" ");
        }

        

        sc.close();
    }
}