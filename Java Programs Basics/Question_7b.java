//Write a program  that takes minutes as input, and display the total number of hours a minutes

import java.util.Scanner;

public class Question_7b{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes : ");
        int minutes = input.nextInt();
        System.out.println(minutes/60+" Hours and "+minutes%60+" Minutes");
                input.close();



        
    }
}