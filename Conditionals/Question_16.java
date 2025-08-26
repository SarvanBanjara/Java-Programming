package Conditionals;

//Accept marks of 4 subjects and calculate percentage if percentage is below 35% - F ,below 45% - D ,  below 55% - C , below 75% - B , above 75% - A 

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Mathematics : ");
        int math = sc.nextInt();
        System.out.print("Science : ");
        int science = sc.nextInt();
        System.out.print("English : ");
        int english = sc.nextInt();
        System.out.print("Hindi : ");
        int hindi = sc.nextInt();
        float per = (float) (math + science + english + hindi) / 4;
        System.out.println("Percentage = " + per + "%");
        if (per < 35) {
            System.out.print("Grade F");
        } else if (per < 45) {
            System.out.print("Grade E");
        } else if (per < 55) {
            System.out.print("Grade D");
        } else if (per < 65) {
            System.out.print("Grade C");
        } else if (per < 75) {
            System.out.print("Grade B");
        }

        else if (per < 100) {
            System.out.print("Grade A");

        } else {
            System.out.print("Invalid Input.");
        }
        sc.close();
    }
}