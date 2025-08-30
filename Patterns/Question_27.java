package Patterns;

// A
// BB
// CCC
// DDDD
// EEEEE

import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        for(int row=1;row<=n;row++){

            for(int col=1;col<=row;col++){
                System.out.printf("%c",row+64);
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}