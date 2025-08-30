package Patterns;

// 54321
//  5432
//   543
//    54
//     5

import java.util.Scanner;

public class Question_28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){

            //printing spaces
            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }
            //printing alphabet
            for(int col=5;col>=row;col--){
                System.out.print(col);
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}