//Write a  program to accept two integers and check whether they are equal or not

import java.util.Scanner;

public class Question_11{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = input.nextInt();
        System.out.print("Enter b : ");
        int b = input.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        input.close();



    }
}