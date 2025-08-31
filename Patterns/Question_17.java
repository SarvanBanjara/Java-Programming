package Patterns;

//    *       *
//  *   *   *   *
//*       *       *

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        for (int row = 1; row <= 3; row++) {
           

            if (row == 1) {
                for(int col=1;col<=n;col++){
                    if(col==1){
                        System.out.print("    *");
                    }
                    else{System.out.print("       *");}
                }
                

            }

            else if (row == 2) {
                for(int col=1;col<=n;col++){
                    if(col==1){
                        System.out.print("  *   *");
                    }
                    else{System.out.print("   *   *");}
                }
                

            }

            else {
                for(int col=1;col<=n;col++){
                    if(col==1){
                        System.out.print("*       *");
                    }
                    else{
                        System.out.print("       *");

                    }
                }
            

            }


            System.out.println();
        }

        sc.close();
    }
}
