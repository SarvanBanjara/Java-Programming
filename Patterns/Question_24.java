package Patterns;

// 1
// 21
// 321
// 4321
// 54321

import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            System.out.println();
        }


        
        
        sc.close();
    }
}

