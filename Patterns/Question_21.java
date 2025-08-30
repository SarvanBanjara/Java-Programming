package Patterns;

//        A
//       B C 
//      D E F
//     G H I J
//    K L M N O
import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int n = sc.nextInt(), input = 65;
        for (int row = 1; row <= n; row++) {
            //printing spaces
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }

            //printing alphabet
            for (int col = 1; col <= row; col++) {
                System.out.printf("%c ", input++);
            }
            System.out.println();
        }

        sc.close();
    }
}