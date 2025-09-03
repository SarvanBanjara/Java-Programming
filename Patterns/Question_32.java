package Patterns;

//        A
//      A B A
//    A B C B A
//  A B C D C B A

import java.util.Scanner;

public class Question_32 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        for(int row=1;row<=n;row++){
            char input='A';
            //printing spaces
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            //printing hald pattern
            for(int col=1;col<=row;col++){
                System.out.print(input++ +" ");
            }
            input--;
            //printing other half pattern
            for(int col=1;col<row;col++){
                System.out.print(--input +" ");
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}
