//Write a program to print the factorial of a number
import java.util.Scanner;
public class Question_2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt(),fact=1;
        for(int i =2;i<=n;i++){
            fact*=i;

        }
        System.out.print("The factorial of "+n+" is "+fact);
        
        sc.close();
    }
}