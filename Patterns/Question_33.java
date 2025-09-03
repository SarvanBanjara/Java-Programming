package Patterns;

//    1
//   101
//  10101
// 1010101
import java.util.Scanner;

public class Question_33 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        for(int row=1;row<=n;row++){
            int input=1;

            //printing spaces
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            //printing patter
            for(int col=1;col<=(row*2)-1;col++){
                System.out.print(input);
                input=1-input;
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}
