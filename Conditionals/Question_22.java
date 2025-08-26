package Conditionals;

//Build a Calculator which perform these operations (+ , - , / , x , %) [MINI PROJECT]

import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Operand : ");
        int a = sc.nextInt();
        System.out.print("Enter  Operand (+ , - , / , x , %) : ");
        char c = sc.next().charAt(0);
        System.out.print("Enter second Operand : ");
        int b = sc.nextInt();
        switch (c) {
            case '+':
                System.out.print(a + " + " + b + " = " + (a + b));

                break;
            case '-':
                System.out.print(a + " - " + b + " = " + (a - b));

                break;
            case '*':
                System.out.print(a + " * " + b + " = " + (a * b));

                break;
            case '/':
                if (b == 0) {
                    System.out.print("Cannot Divide by 0");
                } else {
                    System.out.print(a + " / " + b + " = " + (float) (a / b));
                }

                break;
            case '%':
                System.out.print(a + " % " + b + " = " + (a % b));

                break;

            default:
                System.out.print("Invalid Input");
                break;
        }

        sc.close();
    }
}