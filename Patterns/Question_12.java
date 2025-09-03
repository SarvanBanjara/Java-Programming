package Patterns;

//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            n--;

        }
        int mid=(n/2)+1;

        for(int row =1;row<=mid;row++){
            for(int col=1;col<=mid+row-1;col++){
                if(col==mid-row+1||col==mid+row-1){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
    
            System.out.println();
        }
        
        for(int row =1;row<=n/2;row++){
            for(int col=1;col<=n-row;col++){
                if(col==row+1||col==n-row){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
    
            System.out.println();
        }

  
        sc.close();
    }
}