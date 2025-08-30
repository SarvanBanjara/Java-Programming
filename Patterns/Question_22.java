package Patterns;

//   1
//   22
//   333
//   4444
//   55555
import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        for(int row=1;row<=n;row++){

            for(int col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.println();

        }
        
        
        sc.close();
    }
}