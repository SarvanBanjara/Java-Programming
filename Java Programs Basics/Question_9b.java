// Accept two numbers from user and swap their values without using third variable

import java.util.Scanner;

public class Question_9b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = input.nextInt();
        System.out.print("Enter b : ");
        int b = input.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("a = "+a+" and b = "+b);
                input.close();

    }
}
