//Write a  program to find whether a given year is a leap year or not
import java.util.Scanner;
public class Question_12{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.print("Enter the year : ");
        if(year%400==0){
            System.out.println(year+ " is a Leap Year.");

        }
        else if (year%100!=0 && year%4==0){
            System.out.println(year+ " is a Leap Year.");
        }
        else{
                        System.out.println(year+ " is a not Leap Year.");

        }
        sc.close();
        
        
    }
}
