package Arrays_and_Strings;

// unique elemnt in array
//eg if array has 12345 then uniques else not unique

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean unique = true;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (!unique) {
                break;
            }
        }
        if (unique) {
            System.out.print("The array contains unique elements.");
        } else {
            System.out.print("The array does not contain unique elements.");
        }

        sc.close();
    }
}
