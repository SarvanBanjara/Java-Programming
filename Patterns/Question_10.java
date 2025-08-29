package Patterns;

// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n=sc.nextInt();
        for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col =1;col<=(row*2)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}