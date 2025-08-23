//Write a  program that prints the perimeter of a rectangle to take its height and width as input

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        System.out.print("Enter height of rectangle : ");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        System.out.print("Enter width of rectangle : ");

        int width = input.nextInt();
        System.out.println("Area of rectangle is " + height * width + ".");
        System.out.print("Perimeter of rectangle is " + 2 * (height + width) + ".");
                input.close();


    }
}