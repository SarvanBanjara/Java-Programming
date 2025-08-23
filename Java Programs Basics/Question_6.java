//Write a  program that converts kilometers per hour to miles per hour

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km : ");
        int km = input.nextInt();
        System.out.printf("The distance in MPH is "+"%.2f",(km*0.621371));
                input.close();



        
    }
    
}
