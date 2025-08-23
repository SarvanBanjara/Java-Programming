
//Write a  program that takes hours and minutes as input, and calculates the total number
//of minutes

import java.util.Scanner;

public class Question_7a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hours : ");
        int hour = input.nextInt();
        System.out.print("Minutes : ");

        int minute = input.nextInt();

        System.out.println("The total time in minutes is "+(60*hour+minute));
                input.close();


    }
}