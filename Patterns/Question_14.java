package Patterns;

// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        int input=0,flag=1;
        for(int row=1;row<=n;row++){ 
            if(input==(n+1)/2 || flag==0){
                input--;
                flag=0;
            }
            else{
                input++;

            }

    
           for(int col=1;col<=input;col++){
            System.out.print("*");
           } 
           System.out.println();
        }
        

        
        sc.close();
    }
}
