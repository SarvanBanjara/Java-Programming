// Write a  program to find the Area of Triangle given Base and Height
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        System.out.print("Enter height of Triangle : ");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        System.out.print("Enter width of Triangle : ");
        int base = input.nextInt();
        System.out.print("Area of triangle is "+0.5*(height*base)+".");
                input.close();


    }
}
