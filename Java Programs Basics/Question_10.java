// Write a  program to calculate a bike’s average consumption from the given total distance (integer value) travelled (in km) and spent fuel (in litters, float number – 2 decimal points)

import java.util.Scanner;

public class Question_10{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Distance in Km : ");
      int distance = input.nextInt();
      System.out.print("Fuel Consumed in L : ");
      int fuel = input.nextInt();
      System.out.println("The Average of bike is : "+(float)distance/fuel);
              input.close();

      
    }
}