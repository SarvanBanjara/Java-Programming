package Patterns;

//         *
//       * *
//     * * *
//   * * * *
// * * * * *

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of triangle : ");
        int n =sc.nextInt();
        for(int i =1;i<=n;i++){

            //printing spaces
            for(int j=1;j<=n-i;j++ ){
                System.out.print("  ");
            }

            //printing stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            //using single loop

            // for(int j=1;j<=n;j++){
            //     if(j<=n-i){
            //         System.out.print("  ");
            //     }
            //     else{System.out.print("* ");}
            // }

        

            System.out.println();
        }
        
        
        sc.close();
    }
}