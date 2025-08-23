
//Create a program that converts temperatures from Celsius to Fahrenheit
import java.util.Scanner;


public class Question_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperatur in Celcius : ");
        int celcius = input.nextInt();
        System.out.println("The temperature in Farenheit is "+((celcius*9.0/5)+32));
                input.close();

        
    }
}

