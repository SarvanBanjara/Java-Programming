package Patterns;

//         *
//       *   *
//     *       *
//   *           *
// * * * * * * * * *

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        for(int row=1;row<=n;row++){
            //printing spaces 

            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }

            // printing stars

            for(int col=1;col<=(row*2)-1;col++){
                if(row==1||row==n||col==1||col==(row*2)-1){
                    System.out.print("* ");
                }
                else{System.out.print("  ");}
            }

            System.out.println();


        }
        
        
        sc.close();
    }
}