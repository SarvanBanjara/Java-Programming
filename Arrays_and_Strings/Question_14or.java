package Arrays_and_Strings;

// Write a program to find the frequency of each element in an array.
// Input: n = 7, Array = 1 2 2 3 4 1 2
// Output:
// 1 → 2 times
// 2 → 3 times
// 3 → 1 time
// 4 → 1 time

import java.util.Scanner;

public class Question_14or {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visited[i] = false;
        }

        // isme ek trave kiya aur usme ek aur array banaya usi se chck kr rha
        for (int i = 0; i < n; i++) {
            int frequency = 1;
            if (visited[i]) {
                continue;
            } else {
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        visited[j]=true;
                        frequency++;
                    }
                }

            }
            System.out.println(arr[i]+" -> "+frequency+" times.");
        }

        sc.close();
    }
}