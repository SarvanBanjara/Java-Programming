// Write a  program to compute the perimeter and area of a circle with a given radius
import java.util.Scanner;

public class Question_3{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float radius = input.nextFloat();
        System.out.print("The Perimeter of circle is "+2*3.14*radius+".");
        System.out.print("\nThe Area of circle is "+3.14*radius*radius+".");
        input.close();

    }
}