package Patterns;
//           *
//         *
//       *
//     *
//   *
// *


import java.util.Scanner;

public class Question_41 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of diagonal : ");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            //pritning spaces
            for(int col=1;col<=n-row;col++ ){
                System.out.print("  ");
            }

            //printing stars
            for(int col=1;col<=1;col++){
                System.out.print("* ");
            }
            System.out.println();
    

        }
        
        sc.close();
    }
}
