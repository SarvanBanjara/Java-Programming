
// Write a program to print positive and negative elements of an array separately .
// Sample Input → n (size of array) : 5
// Sample Input → Elements of array : 1 -23 56 -69 36
// Sample Output → Positive Elements : 1 56 36


// when Array.stream  is used import java.util.Arrays;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter elemets of array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean haspositive = false;
        System.out.print("Positive elemets of array are : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                System.out.print(arr[i] + " ");
                haspositive=true;
            }

        }
        if(!haspositive){System.out.print("No positive elements.");}
        boolean hasnegetive = false;
        System.out.print("\nNegetive elemets of array are : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
                hasnegetive = true;
            }

        }
                if(!hasnegetive){System.out.print("No negetive elements.");}


        // //One-line for positive numbers
        // System.out.print("Positive elements: ");
        // Arrays.stream(arr).filter(x -> x >= 0).forEach(x -> System.out.print(x + " "));

        // // One-line for negative numbers
        // System.out.print("\nNegative elements: ");
        // Arrays.stream(arr).filter(x -> x < 0).forEach(x -> System.out.print(x + " "));


        sc.close();
    }
}