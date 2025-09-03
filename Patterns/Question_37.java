package Patterns;

// 1      1
// 12    21
// 123  321
// 12344321
import java.util.Scanner;

public class Question_37 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        
        for(int row=1;row<=n;row++){
            int input=1;
            for(int col=1;col<=row;col++){
                System.out.print(input++ );
            }
            for(int col=1;col<=(n-row)*2;col++){
                System.out.print(" ");
            }
            input--;
            for(int col=1;col<=row;col++){
                System.out.print(input--);
            }
            System.out.println();

        }
        
        
        sc.close();
    }
}
