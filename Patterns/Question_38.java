package Patterns;

//     1
//    212
//   32123
//  4321234
// 543212345

import java.util.Scanner;

public class Question_38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        for(int row=1;row<=n;row++){
            int input=row;
            //prinitng spaces
            for(int col=1;col<=n-row+1;col++){
                System.out.print(" ");
            }
            //printing half pattern
            for(int col=1;col<=row;col++){
                System.out.print(input--);
            }
            input++;
            //priting half other pattern
            for(int col=1;col<=row-1;col++){
                System.out.print(++input);
            }
            System.out.println();
        }


        sc.close();
    }
}
