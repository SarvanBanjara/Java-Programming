
package Loops;

//  1 + 1/2 + 1/3 + 1/4 + ... + 1/N

import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no . : ");
        int n = sc.nextInt();
        float sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.printf("1/%d + ",i);
                sum+=(float)(1.0f/i);

            }
            System.out.printf("= %.3f",sum);
        }

        sc.close();
    }
}