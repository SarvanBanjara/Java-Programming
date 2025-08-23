
// Accept two numbers from user and swap their values 

import java.util.Scanner;

public class Question_9a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = input.nextInt();
        System.out.print("Enter b : ");

        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.print("a = " + a + " and b = " + b);
                input.close();


    }
}