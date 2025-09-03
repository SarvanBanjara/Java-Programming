package Patterns;

// 1  2  3  4  5
// 2  4  6  8 10
// 3  6  9 12 15
// 4  8 12 16 20
// 5 10 15 20 25

import java.util.Scanner;

public class Question_34 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the height : ");
            int n=sc.nextInt();
            for(int row=1;row<=n;row++){
                int input=row;
                for(int col=1;col<=n;col++){
                    System.out.printf("%-3d",input);
                    input+=row;
                }
                System.out.println();
            }
        
        
        sc.close();
    }
}