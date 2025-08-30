package Patterns;

//       5
//      45
//     345
//    2345
//   12345
import java.util.Scanner;

public class Question_29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n= sc.nextInt();
        for(int row=1;row<=n;row++){
            //printing spaces 
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }

            //printing Pattern
            for(int col=1;col<=row;col++){
                
                System.out.print(n-row+col);
            }

            System.out.println();
        }

        sc.close();
    }
}