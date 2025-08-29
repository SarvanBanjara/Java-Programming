package Patterns;

//    1
//    2 3
//    4 5 6
//    7 8 9 10


import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n =sc.nextInt(),input=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.printf("%-2d",input++);
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}