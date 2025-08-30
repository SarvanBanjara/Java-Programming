package Patterns;

// 1
// 11
// 121
// 1331
// 14641
import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt();
        int input=1;
        for(int row=1;row<=n;row++){
            
            System.out.println(input);
            input*=11;

        }

        
        
        sc.close();
    }
}