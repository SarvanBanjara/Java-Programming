package Patterns;

//         1
//       1   1
//     1   2   1
//   1   3   3   1

import java.util.Scanner;

public class Question_31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        int input=1;
        for(int row =1;row<=n;row++){
            //printing spaces 
            String inputstring=String.valueOf(input);
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            //printing pattern
            for(int col=1;col<=row;col++){
                System.out.print(inputstring.charAt(col-1)+"   ");
            }
            input*=11;
            System.out.println();
        }
        
        
        sc.close();
    }
}