package Patterns;

// 1
// 23
// 456
// 78910

import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt(),input=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(input++);

            }
            System.out.println();

        }
        
        
        
        sc.close();
    }
}