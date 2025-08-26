package Loops;

//Write a program  to print natural numbers up to n
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}