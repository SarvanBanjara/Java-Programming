//Design a program that calculates the simple interest based on user-provided principal, rate, and time

import java.util.Scanner;

public class Question_8{
    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.print("Principle : ");
    int principle = input.nextInt();
        System.out.print("Rate : ");

    int rate =input.nextInt();
        System.out.print("Time : ");

    int time =input.nextInt();
    System.out.println("Simple Interest = "+(float) principle*rate*time/100);
            input.close();

}
}