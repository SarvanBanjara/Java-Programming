package Patterns;

//     1
//    121
//   12321
//  1234321
// 123454321
//  1234321
//   12321
//    121
//     1

import java.util.Scanner;

public class Question_35 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt(),mid=(n+1)/2;
        if(n%2==0){
            n--;
        }//upper half
        for(int row=1;row<=mid;row++){
            
            //spaces
            for(int col=1;col<=mid-row;col++){
                System.out.print(" ");
            }
            //half pattern
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            
            for(int col=row-1;col>=1;col--){
                System.out.print(col);
            }
            System.out.println();

        }
        //lower half
        for(int row=1;row<mid;row++){
            //spaces
            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }
            //half pattern
            for(int col=1;col<=mid-row;col++){
                System.out.print(col);
            }
            
            for(int col=mid-row-1;col>=1;col--){
                System.out.print(col);
            }
            System.out.println();

        }
        
        
        
        sc.close();
    }
}