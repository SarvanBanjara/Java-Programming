package Patterns;


// 1      1
// 12    21
// 123  321
// 12344321
import java.util.Scanner;

public class Question_37or {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt(),m=n*2;
        char[] input= new char[m];
        
        for(int row=0;row<m;row++){
            input[row]=' ';
        }
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                input[col-1]=(char)(col+'0');
                input[m-col]=(char)(col+'0');
            }
            System.out.print(input);
            System.out.println();

        }
        
        
        sc.close();
    }
}
