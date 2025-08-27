package Arrays_and_Strings;

//Write a program to find the frequency of each element in an array.

// Input: n = 7, Array = 1 2 2 3 4 1 2
// Output:
// 1 → 2 times  
// 2 → 3 times  
// 3 → 1 time  
// 4 → 1 time

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // maine array me single trave kiya usi me nested loop lagakr frequency count ki aur agr eqal aa rhe to array ko maine vhi se last tk update kiya aur n aur nested luup element ko -1 kiya jise loop out of bound n jaye .

        for (int i = 0; i < n; i++) {
            int frequency = 1;

            if (i == n - 1) {
                System.out.print(arr[i] + " -> " + frequency + " times.");

            } 
            
            else {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        frequency++;
                        for (int k = j; k < n - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        j--;
                        n--;
                    }

                }

                System.out.println(arr[i] + " -> " + frequency + " times.");
            }
        }

        sc.close();
    }
}
